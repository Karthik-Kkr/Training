package com.capg.login.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "register")
public class Register {
	
	private String name;
	private int userId;
	
	@NotNull
	@NotBlank(message = "Mention your mobile number")
	@Size(min = 10,max = 10)
	private long mobileNo;
	private String email;
	private String password;
	
	public Register() {	
	}

	public Register(String name, int userId, long mobileNo, String email, String password) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Model [name=" + name + ", userId=" + userId + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", password=" + password + "]";
	}
}
