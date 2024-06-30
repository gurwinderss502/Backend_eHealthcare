package com.eHealthcareSystem.EHealthcareSystem.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDTO {
	
	private int userId;
	private String UserFname;
	private String UserLname;
	private String Email;
	private String Phone;
	private String gender;
	private String password;
	
	public UserDTO(int userId, String userFname, String userLname, String email, String phone, String gender,
			String password) {
		super();
		this.userId = userId;
		this.UserFname = userFname;
		this.UserLname = userLname;
		this.Email = email;
		this.Phone = phone;
		this.gender = gender;
		this.password = password;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFname() {
		return UserFname;
	}
	public void setUserFname(String userFname) {
		UserFname = userFname;
	}
	public String getUserLname() {
		return UserLname;
	}
	public void setUserLname(String userLname) {
		UserLname = userLname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", UserFname=" + UserFname + ", UserLname=" + UserLname + ", Email="
				+ Email + ", Phone=" + Phone + ", gender=" + gender + ", password=" + password + "]";
	}
	
	

}
