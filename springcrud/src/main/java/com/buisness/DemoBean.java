package com.buisness;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.customerdao;
import com.dto.Customer;

public class DemoBean {
	@Autowired
	private customerdao customerdao;

	public void setCustomerdao(customerdao customerdao) {
		this.customerdao = customerdao;
	}

	public void insertCustomer(int custid, String custname, String city) {
		Customer customer = new Customer();
		customer.setCustid(custid);
		customer.setName(custname);
		customer.setCity(city);
		int result = customerdao.insert(customer);
		System.out.println(result + " insert successful");
	}
	public int deleteCustomer(int custid){
		return customerdao.deleteCustomer(custid);
	}
	public Customer selectCustomer(int custid)
	{
		return customerdao.selectCustomer(custid);
	}
	public void updateCustomer(Customer customer){
		customerdao.updateCustomer(customer);
	}

}
