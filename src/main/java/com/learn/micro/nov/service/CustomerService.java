package com.learn.micro.nov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.micro.nov.bean.CustomerBean;


@Service
public class CustomerService {

	@Autowired
    CustomerRepository customerRepository;

    public List<CustomerBean> findAll() {
        return (List<CustomerBean>) customerRepository.findAll();
    }
	
    public CustomerBean getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    public void saveOrUpdate(CustomerBean customer) {
    	customerRepository.save(customer);
    }

    public void delete(int id) {
    	customerRepository.deleteById(id);
    }

	public void updateCustomer(int id, CustomerBean customer) {
		
		customer.setId(id);
		customerRepository.save(customer);
		
	}
}
