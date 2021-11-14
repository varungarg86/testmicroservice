package com.learn.micro.nov.service;

import org.springframework.data.repository.CrudRepository;

import com.learn.micro.nov.bean.CustomerBean;


public interface CustomerRepository extends CrudRepository<CustomerBean, Integer>
 {

}
