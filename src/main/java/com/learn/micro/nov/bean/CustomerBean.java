package com.learn.micro.nov.bean;

import javax.persistence.*;

@Entity
@Table(name="t_customer")
public class CustomerBean {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	@Column(name = "age", nullable = false)
	public String age;
	
	@Column(name = "address", nullable = false)
	public String address;
	
	@Column(name = "account_type", nullable = false)
	public String account_type;

	
}
