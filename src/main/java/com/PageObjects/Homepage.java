package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Homepage extends Testbase {

	private static final WebElement Company = null;

	public Homepage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	// Inventory
	@FindBy(xpath = "//i[contains(@class,'fa-houzz')]")
	WebElement Inventory;
	// all inventory
	@FindBy(xpath = "//ul[@class='treeview-menu']/li/a[text()='All Inventory']")
	WebElement AllInventory;
	// movestock
	@FindBy(xpath = "//ul[@class='treeview-menu']/li/a[contains(text(),'Move Stock')]")
	WebElement Movestock;
	// master
	@FindBy(xpath = "//i[contains(@class,'fa-database')]")
	WebElement master;
	// customer
	@FindBy(xpath = "//i[contains(@class,'fa-users')]")
	WebElement customer;
	// all customers
	@FindBy(linkText = "All Customers")
	WebElement allcustomer;
	// add customer
	@FindBy(linkText = "Add Customer")
	WebElement addcustomer;
	// usertype
	@FindBy(xpath = "//a[@href='/Master/Usertypes']")
	WebElement usertype;
	// holiday
	@FindBy(linkText = "Holidays")
	WebElement holidays;

	// location
	@FindBy(xpath = "//a[text()='Location ']")
	WebElement location;
	
	//condition
			@FindBy(xpath="//a[text()='Condition']")
			WebElement condition;

	public Homepage(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);
	}

	public Inventory inventory() throws Throwable {
		Utils.moveToElement(Inventory);
		AllInventory.click();
		return new Inventory();
	}

	public MovingStock movestock() throws Throwable {
		Utils.moveToElement(Inventory);
		Movestock.click();
		return movestock();

	}

	public USERtype usertype() throws Throwable {

		Utils.moveToElement(master);
		usertype.click();
		return new USERtype();
	}

	public void addcustomer() {
		Utils.moveToElement(customer);
		addcustomer.click();
	}

	public void editcustomer() {
		Utils.moveToElement(customer);
		allcustomer.click();
	}

	public HolidaysFunctionality holidays() throws Throwable {
		Utils.moveToElement(master);
		holidays.click();
		return new HolidaysFunctionality();

	}

	public LocationInformation location() throws Throwable {
		Utils.moveToElement(master);
		location().click();
		return new LocationInformation();
	}
	
	public ConditionData Condition()throws Throwable
	{
		Utils.moveToElement(master);
		condition.click();
		return new ConditionData();
  }
	public ShiftTimings Shifts() throws Throwable
	{
		Utils.moveToElement(master);
		ShiftTimings.click();
		return new ShiftTimings();
	}
	public Company Company() throws Throwable
	{
		Utils.moveToElement(master);
		Company.click();
		return new Company();
  }

	public void company() {
		// TODO Auto-generated method stub
		
	}

}