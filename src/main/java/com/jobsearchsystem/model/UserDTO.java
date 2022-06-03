package com.jobsearchsystem.model;

import org.springframework.stereotype.Component;

 @Component
public class UserDTO {
	 
	private int userId;
	private String name;
	private String gender;
	private String address;
	private String email;
	private String userName;
	private String password;
	 
	public UserDTO() {
		super();
	}

	public UserDTO(int userId, String name, String gender, String address, String email, String userName,
			String password) {
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", name=" + name + ", gender=" + gender + ", address=" + address + ", email="
				+ email + ", userName=" + userName + ", password=" + password + "]";
	}
}