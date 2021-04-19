package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bidder")
public class Bidder {
	
	@Id
	@GeneratedValue
	@Column(name = "bidder_id")
	private int id;
	
	@Column(name = "bidder_name")
	private String name;
	
	@Column(name = "bidder_contact")
	private int contact;
	
	@Column(name = "bidder_email")
	private String email;
	
	@Column(name = "bidder_address")
	private String address;
	
	@Column(name = "bidder_state")
	private String State;
	
	@Column(name = "bidder_pincode")
	private int pincode;
	
	@Column(name = "bidder_bankAccountNo")
	private int bankAccountNo;
	
	@Column(name = "bidder_ifscCode")
	private int ifscCode;
	
	@Column(name = "bidder_password")
	private String password;
	
	@OneToMany(mappedBy = "bidder")
	private List<CropSold> cropsBought;
	
	@OneToOne(mappedBy = "bidder")
	private Bid bid;
	
	//Getters and Setters

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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(int bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<CropSold> getCropsBought() {
		return cropsBought;
	}

	public void setCropsBought(List<CropSold> cropsBought) {
		this.cropsBought = cropsBought;
	}

	public Bid getBid() {
		return bid;
	}

	public void setBid(Bid bid) {
		this.bid = bid;
	}	
	
}
