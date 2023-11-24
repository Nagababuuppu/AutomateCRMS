package com.testcases;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.PageObjects.Homepage;
	import com.PageObjects.Login_functionality;
import com.PageObjects.ShiftTimings;
import com.PageObjects.Shiftsinformation;
    import com.base.Testbase;

	public class Shifts_Test extends Testbase{

		public Shifts_Test() throws Throwable {
			super();
			// TODO Auto-generated constructor stub
		}
		Login_functionality lf;
		Homepage h;
		Shiftsinformation std;
		ShiftTimings s;
	@BeforeMethod
	public void setup() throws Throwable
	{
		Initialization();
		 lf=new Login_functionality(driver);
		 h=new Homepage(driver);
		 std=new Shiftsinformation(driver);
		 s=new ShiftTimings(driver);
		 lf.Dologin();
	}
	@Test(priority=1)
	public void addShift() throws Throwable
	{
		h.Shifts();
		s.addShift();
		std.addShift();
	}
	@Test(priority=2)
	public void deleteShift() throws Throwable
	{
		h.Shifts();
		s.deleteShift();	
	}
	@Test(priority=3)
	public void verify() throws Throwable

	{
		h.Shifts();
		s.verify();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
