package com.pojo;
// Generated Feb 10, 2017 2:09:28 PM by Hibernate Tools 3.4.0.CR1

/**
 * Hiber generated by hbm2java
 */
public class Hiber implements java.io.Serializable {

	private Integer id;
	private String name;
	private String password;
	private String email;

	public Hiber() {
	}

	public Hiber(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
