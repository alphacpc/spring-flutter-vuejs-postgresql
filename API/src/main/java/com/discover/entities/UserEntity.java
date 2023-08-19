package com.discover.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="user_fname")
	private String userFname;
	
	@Column(name="user_lname")
	private String userLname;
	
	@Column(name="user_role")
	private String userRole;
	
	@Column(name="user_actif")
	private Boolean userActif;
	
	@Column(name="user_password")
	private String userPwd;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="date_update")
	private Date dateUpdate;
	
	
	public UserEntity() {
	
	}
	
	
	
	public UserEntity(String userFname, String userLname, String userRole, Boolean userActif, String userPwd,
			String userEmail) {
		super();
		this.userFname = userFname;
		this.userLname = userLname;
		this.userRole = userRole;
		this.userActif = userActif;
		this.userPwd = userPwd;
		this.userEmail = userEmail;
	}



	public UserEntity(Long userId, String userFname, String userLname, String userRole, Boolean userActif,
			String userPwd, String userEmail) {
		this.userId = userId;
		this.userFname = userFname;
		this.userLname = userLname;
		this.userRole = userRole;
		this.userActif = userActif;
		this.userPwd = userPwd;
		this.userEmail = userEmail;
	}


	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Boolean getUserActif() {
		return userActif;
	}
	public void setUserActif(Boolean userActif) {
		this.userActif = userActif;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	
}
