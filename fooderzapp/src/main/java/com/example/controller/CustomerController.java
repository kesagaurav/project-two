package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	@PostMapping("/customer")
	public Customer addCustomer( @ RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return service.addCustomer(customer) ;
	}

	@DeleteMapping("/customer/id")
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		service.deleteCustomer(id);
	}

	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return service.getAllCustomers();
	}

}
