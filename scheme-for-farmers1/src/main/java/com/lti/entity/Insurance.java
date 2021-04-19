package com.lti.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_insurance")
public class Insurance {
	
	@Id
	@GeneratedValue
	@Column(name = "insurance_policyNo")
	private int policyNo;
	
	@Column(name = "insurance_company")
	private String InsuranceCompany;
	
	@Column(name = "insurance_sumInsured")
	private double sumInsured;
	
	@Column(name = "insurance_sharePremium")
	private double sharePremium;
	
	@Column(name = "insurance_premium")
	private double premium;
	
	@Column(name = "insurance_cropName")
	private String cropName;
	
	@Column(name = "insurance_area")
	private double area;
	
	@Column(name = "insurance_season")
	private String season;
	
	@Column(name = "insurance_crop")
	private String crop;
	
	@Column(name = "insurance_year")
	private LocalDate year;
	
	@OneToOne
	@JoinColumn(name = "farmer_id")
	private Farmer farmer;
	
	@OneToOne(mappedBy = "insurance")
	private ClaimInsurance claim;

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getInsuranceCompany() {
		return InsuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		InsuranceCompany = insuranceCompany;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public double getSharePremium() {
		return sharePremium;
	}

	public void setSharePremium(double sharePremium) {
		this.sharePremium = sharePremium;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public ClaimInsurance getClaim() {
		return claim;
	}

	public void setClaim(ClaimInsurance claim) {
		this.claim = claim;
	}
	
	
}
