package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cropSold")
public class CropSold {
	
	@Id
	@GeneratedValue
	@Column(name = "cropSold_id")
	private int id;
	
	@Column(name = "cropSold_cropName")
	private String cropName;
	
	@Column(name = "cropSold_quantity")
	private double quantity;
	
	@Column(name = "cropSold_soldPrice")
	private double soldPrice;
	
	@Column(name = "cropSold_basePrice")
	private double basePrice;
	
	@Column(name = "cropSold_sellingDate")
	private LocalDate sellingDate;
	
	@ManyToOne
	@JoinColumn(name = "farmer_id")
	private Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name = "bidder_id")
	private Bidder bidder;
	
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public LocalDate getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(LocalDate sellingDate) {
		this.sellingDate = sellingDate;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	
	
	
	

}
