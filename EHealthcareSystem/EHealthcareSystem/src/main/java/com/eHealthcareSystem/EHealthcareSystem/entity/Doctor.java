package com.eHealthcareSystem.EHealthcareSystem.entity;
import jakarta.persistence.*;

@Entity
@Table(name="doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="full_name")
	private String fname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String age;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="specialization")
	private String specialization;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long id, String fname, String gender, String age, String phone, String email, String qualification,
			String specialization) {
		super();
		this.id = id;
		this.fname = fname;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.qualification = qualification;
		this.specialization = specialization;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
	
}
