package com.africa.types;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {
	
	@Id
	@SequenceGenerator(
			name = "users_sequence",
			sequenceName = "users_sequence",
			allocationSize = 1
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "users_sequence"
	)

	private Long userid;
	private String fname;
	private String lname;
	private String role;
	private String email;
	private String password;
	private String job;
	
	
	public Users() {
		super();
	}


	public Users(Long userid, String fname, String lname, String role, String email, String password, String job) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.email = email;
		this.password = password;
		this.job = job;
	}


	public Users(String fname, String lname, String role, String email, String password, String job) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.email = email;
		this.password = password;
		this.job = job;
	}


	public Long getUserid() {
		return userid;
	}


	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", role=" + role + ", email="
				+ email + ", password=" + password + ", job=" + job + "]";
	}
	
	
	
}
