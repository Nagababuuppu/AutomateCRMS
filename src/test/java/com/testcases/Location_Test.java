package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Homepage;
import com.PageObjects.LocationInformation;
import com.PageObjects.Location_Functionality;
import com.PageObjects.Login_functionality;
import com.base.Testbase;

public class Location_Test extends Testbase{

	public Location_Test() throws Throwable {
		super();
	}
   Login_functionality lf;
   Homepage h;
   LocationInformation l;
   Location_Functionality ltd;
	@BeforeMethod
	public void setup() throws Throwable
	{
		Initialization();
		lf=new Login_functionality(driver);
		h=new Homepage(driver);
		l=new LocationInformation(driver);
		ltd=new Location_Functionality(driver);
		lf.Dologin();
	}
	@Test(priority=1)
	public void addlocation() throws Throwable
	{
		h.location();
		l.addlocation();
		ltd.addlocation();
	}
	@Test(priority=2)
	public void editcustomer() throws Throwable
	{
		h.location();
		l.editlocation();
		ltd.editlocation();
	}
	@Test(priority=3)
	public void deletecustomer() throws Throwable
	{
		h.location();
		l.deletecustomer();
	}
	@Test(priority=4)
	public void verify() throws Throwable
	{
		h.location();
		l.verification();
	}
}