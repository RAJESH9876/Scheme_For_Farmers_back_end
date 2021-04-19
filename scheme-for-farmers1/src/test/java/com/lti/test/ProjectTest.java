package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.entity.Bid;
import com.lti.entity.Bidder;
import com.lti.entity.ClaimInsurance;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.MarketPlace;
import com.lti.entity.Request;


public class ProjectTest {
	
	@Test
	public void addFarmer() {
		
		GenericDao dao = new GenericDao();
		
		Farmer f = new Farmer();
		f.setName("Rama");
		f.setAddress("srikakulam");
		f.setArea(532001);
		f.setBankAccountNo(4343);
		f.setContact(96516546);
		f.setEmail("rama@gmail.com");
		f.setIfscCode(2222);
		f.setLandAddress("kotha peta");
		f.setPincode(89898);
		f.setState("srikakulam");
		f.setPassword("rama123");
		
		dao.save(f);
		
	}
	
	@Test
	public void addInsuranceForFarmer() {
		
		GenericDao dao = new GenericDao();
		Farmer f = (Farmer)dao.fetch(Farmer.class, 83);
		
		Insurance i = new Insurance();
		i.setInsuranceCompany("goldman");
		i.setSumInsured(10000);
		i.setSharePremium(500);
		i.setPremium(1000);
		i.setCropName("wheat");
		i.setArea(500);
		i.setSeason("harvest");
		i.setCrop("grains");
		i.setYear(LocalDate.now());
		i.setFarmer(f);
		dao.save(i);
		
	}
	
	@Test
	public void claimInsurance() {
		
		GenericDao dao = new GenericDao();
		Insurance i = (Insurance)dao.fetch(Insurance.class, 84);
		
		ClaimInsurance ci = new ClaimInsurance();
		ci.setInsuranceCompany("goldman");
		ci.setInsureeName("john");
		ci.setSumInsured(10000);
		ci.setCause("drought");
		ci.setLossDate(LocalDate.now());
		ci.setInsurance(i);
		dao.save(ci);
		
	}
	
	@Test
	public void requestToSell() {
		
		GenericDao dao = new GenericDao();
		Farmer f = (Farmer)dao.fetch(Farmer.class, 83);
		
		Request sr = new Request();
		sr.setCropType("grains");
		sr.setCropName("wheat");
		sr.setFertilizer("organic");
		sr.setQuantity(450);
		sr.setSoilPH(7);
		sr.setBidCutoffTime(24);
		sr.setFarmer(f);
		dao.save(sr);
		
	}
	
	@Test
	public void addToMarket() {
		
		GenericDao dao = new GenericDao();
		Request sr = (Request)dao.fetch(Request.class, 86);
		
		MarketPlace mp = new MarketPlace();
		mp.setCropName(sr.getCropName());
		mp.setCropType(sr.getCropType());
		mp.setBasePrice(25000);
		mp.setRequest(sr);
		dao.save(mp);
		
	}
	
	@Test
	public void addBidder() {
		
		GenericDao dao = new GenericDao();
		
		Bidder b = new Bidder();
		b.setName("smith");
		b.setContact(35345);
		b.setEmail("smith@yahoo.com");
		b.setAddress("mumbai");
		b.setState("maharashtra");
		b.setPincode(420001);
		b.setBankAccountNo(4253452);
		b.setIfscCode(4444);
		b.setPassword("password1234");
		dao.save(b);
	}
	
	@Test
	public void biddingOnCrop() {
		
		GenericDao dao = new GenericDao();
		Bidder b = (Bidder)dao.fetch(Bidder.class, 89);
		MarketPlace mp = (MarketPlace)dao.fetch(MarketPlace.class, 88);
		
		Bid bid = new Bid();
		bid.setBidAmount(200);
		bid.setBidDate(LocalDate.now());
		bid.setBasePrice(mp.getBasePrice());
		bid.setMarket(mp);
		bid.setBidder(b);
		dao.save(bid);
	}
	

}
