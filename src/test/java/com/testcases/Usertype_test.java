package com.testcases;

 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Homepage;
import com.PageObjects.Login_functionality;
import com.PageObjects.USERtype;
import com.base.Testbase;

 
public class Usertype_test extends Testbase {
 
	public Usertype_test() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	 Login_functionality lf;
	 Homepage h;
 
	 USERtype u;
 
	 @BeforeMethod
	 public void setup() throws Throwable {

			Initialization();
			 lf = new Login_functionality(driver);
			 h=new Homepage(driver);
			 u=new USERtype(driver);
			 
	 }
	 @Test(priority = 1)
	 public void adduser() throws Throwable
	 {
		 lf.Dologin();
		 h.usertype();
		 u.adduser();
	 }
	 @Test(priority = 2)
	 public void edituser() throws Throwable
	 {
		 lf.Dologin();
		 h.usertype();
		 u.edituser();
		 Thread.sleep(2500);
		 u.verification();
	 }
}