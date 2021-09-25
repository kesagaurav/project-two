package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface CustomerService {

		Customer addCustomer(Customer customer);
		void deleteCustomer(int id);
		List<Customer> getAllCustomers();
		
	
}
