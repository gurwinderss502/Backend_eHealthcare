package com.eHealthcareSystem.EHealthcareSystem.entity;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="user_id",length=45)
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int userId;
	
	@Column(name="user_fname",length=225)
	private String UserFname;
	
	@Column(name="user_lname",length=225)
	private String UserLname;
	
	@Column(name="email",length=225)
	private String email;
	
	@Column(name="phone",length=225)
	private String phone;
	
	@Column(name="gender",length=225)
	private String gender;
	
	@Column(name="password",length=225)
	private String password;

	public User(int userId, String userFname, String userLname, String email, String phone, String gender,
			String password) {
		super();
		this.userId = userId;
		this.UserFname = userFname;
		this.UserLname = userLname;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
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
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
	    phone = phone;
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

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserFname=" + UserFname + ", UserLname=" + UserLname + ", email=" + email
				+ ", Phone=" + phone + ", gender=" + gender + ", password=" + password + "]";
	}
	
	
	
}
