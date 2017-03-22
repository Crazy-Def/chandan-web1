package com.dao;

import com.dto.Customer;

public interface customerdao {
	Customer selectCustomer(int custid);
	int insert(Customer c);
	int deleteCustomer(int custid);
	void updateCustomer(Customer customer);
}
