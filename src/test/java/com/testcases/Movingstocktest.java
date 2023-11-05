package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Homepage;
import com.PageObjects.Login_functionality;
import com.PageObjects.MovingStock;
import com.PageObjects.Stockmoving;
import com.base.Testbase;

public class Movingstocktest extends Testbase {
	public Movingstocktest() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	 Login_functionality lf;
	 Homepage h;
	 MovingStock m;
	 Stockmoving sm;
	 @BeforeMethod
	 public void setup() throws Throwable {

			Initialization();
			 lf = new Login_functionality(driver);
			 h=new Homepage(driver);
			 m=new MovingStock(driver);
			 sm=new Stockmoving(driver);
			 lf.Dologin();
			  
	 }
	 @Test(priority=1)
	 public void wareHouseToshowRoom() throws Throwable
	 {
		 
		 h.movestock();
		 m.wareHousetoshowRoom();
		 sm.verifyWHtoSR();
		 
	 }
	 @Test(priority=2)
	 public void showRoomtowareHouse() throws Throwable
	 {
		  
		 h.movestock();
		 m.showRoomtowareHouse();
		 sm.verifySRtoWH();
	 }
}