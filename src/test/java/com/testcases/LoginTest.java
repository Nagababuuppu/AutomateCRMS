package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjects.Login_functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class LoginTest extends Testbase {

	Login_functionality lf;
    Utils u;
	public LoginTest() throws Throwable {
		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {

		Initialization();

		lf = new Login_functionality(driver);
		 u=new Utils(driver); 
	}

	@Test

	public void Verifylogin() {

		lf.Dologin();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard", url);

	}
	@Test(dataProvider="user",dataProviderClass=LoginTest.class)
	 public void Verfiylogin(String Username,String Password)
	 {
		 lf.DologinExcel(Username,Password);
		 String url = driver.getCurrentUrl();

			Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard", url);
	 }
	@DataProvider(name="user")
	public  Object[][] getdata() throws IOException
	{
		return u.getdatafromexcel("Sheet1");
	}

	@AfterMethod

	public void teardown() {

		driver.close();

	}

}
