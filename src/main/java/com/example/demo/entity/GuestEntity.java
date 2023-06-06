package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "guests")
public class GuestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String address;
	private String email;
	private String phone;
	private String password;
	private LocalDate birthday;
	
	public GuestEntity() {}

	public GuestEntity(String name, String address, String email, String phone, String password, LocalDate birthday) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.birthday = birthday;
	}

	public GuestEntity(int id, String name, String address, String email, String phone, String password,
			LocalDate birthday) {
		this(name, address, email, phone, password, birthday);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
}
