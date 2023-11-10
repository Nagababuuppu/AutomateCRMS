package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.HolidaysFunctionality;
import com.PageObjects.Homepage;
import com.PageObjects.Login_functionality;
import com.base.Testbase;

public class Holidays_testing extends Testbase {

	public Holidays_testing() throws Throwable {
		super();
	 
	}
	Login_functionality lf;
	 Homepage h;
	 HolidaysFunctionality hd;
	 
	 @BeforeMethod
	 public void setup() throws Throwable {

			Initialization();
			 lf = new Login_functionality(driver);
			 h=new Homepage(driver);
			 hd=new HolidaysFunctionality(driver);
			 lf.Dologin();		  
	 }
	 @Test(priority=1)
	 public void addholiday() throws Throwable
	 {
		 h.holidays();
		 hd.addholiday();
	 }
	 @Test(priority=2)
	 public void editholiday() throws Throwable
	 {
		 h.holidays();
		 hd.editholiday();
	 }
	 @Test(priority=3)
	 public void deleteholiday() throws Throwable
	 {
		 h.holidays();
		 hd.deleteholiday();
	 }
	 @Test(priority=4)
	 public void verify() throws Throwable
	 {
		 h.holidays();
		 hd.verify();
	 }
}