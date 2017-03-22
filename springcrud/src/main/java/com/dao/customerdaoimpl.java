package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dto.Customer;

public class customerdaoimpl implements customerdao {
	private JdbcTemplate JdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer selectCustomer(int custid) {
		// TODO Auto-generated method stub
		final Customer customer=new Customer();
		String quer="SELECT * FROM customer WHERE custid='"+custid+"'";
		
		return JdbcTemplate.query(quer, new ResultSetExtractor<Customer>(){ public Customer extractData(ResultSet rs)throws SQLException,DataAccessException{if(rs.next()){customer.setCustid(rs.getInt(1));customer.setName(rs.getString(2));customer.setCity(rs.getString(3));}
		return customer;}});
	}

	@Override
	public int insert(Customer c) {
		// TODO Auto-generated method stub
		int custid=c.getCustid();
		String name=c.getName();
		String city=c.getCity();
		int rows=JdbcTemplate.update("insert into customer values(?,?,?)",custid,name,city);
		return rows;
	}

	@Override
	public int deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		String query="DELETE from customer where custid=?";
		
		return JdbcTemplate.update(query, new Object[]{Integer.valueOf(custid)});
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String query="UPDATE customer SET custname=?,city=? WHERE custid=?";
		JdbcTemplate.update(query, new Object[]{customer.getName(),customer.getCity(),Integer.valueOf(customer.getCustid())});
		
		
	}

}
