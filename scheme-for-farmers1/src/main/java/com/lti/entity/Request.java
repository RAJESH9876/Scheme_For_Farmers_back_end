package com.lti.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_request")
public class Request {
	
	@Id
	@GeneratedValue
	@Column(name = "request_id")
	private int id;
	
	@Column(name = "request_cropType")
	private String cropType;
	
	@Column(name = "request_cropName")
	private String cropName;
	
	@Column(name = "request_fertilizer")
	private String fertilizer;
	
	@Column(name = "request_quantity")
	private double quantity;
	
	@Column(name = "request_soilPH")
	private double soilPH;
	
	@Column(name = "request_hrs")
	private float bidCutoffTime; // this will be in hours
	
	@OneToOne
	@JoinColumn(name = "farmer_id")
	private Farmer farmer;
	
	@OneToOne(mappedBy = "request")
	private MarketPlace market;
	
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getSoilPH() {
		return soilPH;
	}

	public void setSoilPH(double soilPH) {
		this.soilPH = soilPH;
	}

	public float getBidCutoffTime() {
		return bidCutoffTime;
	}

	public void setBidCutoffTime(float bidCutoffTime) {
		this.bidCutoffTime = bidCutoffTime;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public MarketPlace getMarket() {
		return market;
	}

	public void setMarket(MarketPlace market) {
		this.market = market;
	}
	

}
