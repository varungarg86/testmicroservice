package com.learn.micro.nov.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.micro.nov.bean.CustomerBean;
import com.learn.micro.nov.service.CustomerService;

@RestController
public class CustomerResource {
	
	@Autowired
	CustomerService service;

	//http://localhost:8080//customers
	@GetMapping("/customers")
	public List<CustomerBean> getAllUsers(){
	
		return service.findAll();  
		
	}
	
	//http://localhost:8080//customer/1
    @GetMapping("/customer/{id}")
    private CustomerBean getCustomer(@PathVariable("id") int id) {
        return service.getCustomerById(id);
    }
    
    @GetMapping("/customers/{id}")
    private EntityModel<CustomerBean> getCustomers(@PathVariable("id") int id) {
    	
    	EntityModel<CustomerBean> model = EntityModel.of(service.getCustomerById(id));
    	
    	WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
    	model.add(link.withRel("all-customers"));
        return model;
    }
    
    @DeleteMapping("/customer/{id}")
    private void deleteCustomer(@PathVariable("id") int id) {
        service.delete(id);
    }

    
    @PostMapping("/customers")
    private int saveCustomer(@RequestBody CustomerBean customer) {
        service.saveOrUpdate(customer);
        return customer.getId();
    }
    
    @PutMapping("/customer/{id}")
    private void updateCustomer(@RequestBody CustomerBean customer, @PathVariable("id") int id) {
        service.updateCustomer(id, customer);
    }
	
}
