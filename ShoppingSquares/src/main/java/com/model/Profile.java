package com.model;

public class Profile {

	private String email;
	private String phone;
	private String username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Profile [email=" + email + ", phone=" + phone + ", username=" + username + "]";
	}
	
	
}
