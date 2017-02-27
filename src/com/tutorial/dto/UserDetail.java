package com.tutorial.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "USER_DETAIL")
public class UserDetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int useID;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "ADDRESS")
	private String Address;
	
	@Column (name= "DATE_OF_JOIN")
	@Temporal (TemporalType.DATE)
	private Date dateOfJoin;
	
	@Column (name ="DESCREPTION")
	@Lob
	private String descreption;

	public int getUseID() {
		return useID;
	}

	public void setUseID(int useID) {
		this.useID = useID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	
	
}
