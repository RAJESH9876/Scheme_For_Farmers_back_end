package com.lti.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_bid")
public class Bid {
	
	@Id
	@GeneratedValue
	@Column(name = "bid_id")
	private int id;
	
	@Column(name = "bid_amount")
	private double bidAmount;
	
	@Column(name = "bid_date")
	private LocalDate bidDate;
	
	@Column(name = "bid_basePrice")
	private double basePrice;
	
	@ManyToOne
	@JoinColumn(name = "market_itemId")
	private MarketPlace market;
	
	@OneToOne
	@JoinColumn(name = "bidder_id")
	private Bidder bidder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}

	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}

	public MarketPlace getMarket() {
		return market;
	}

	public void setMarket(MarketPlace market) {
		this.market = market;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	

}
