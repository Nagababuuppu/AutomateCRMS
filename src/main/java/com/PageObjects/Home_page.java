package com.PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.TestBase;
import com.base.TestBase;

public class Home_page extends TestBase{

	public Home_page() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//i[contains(@class,'fa-houzz')]")
	WebElement Inventory;
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[text()='All Inventory']")
	WebElement AllInventory;
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[contains(text(),'Move Stock')]")
	WebElement Movestock;
	@FindBy(xpath="//i[contains(@class,'fa-database')]")
	WebElement master; 
		@FindBy(xpath="//a[@href='/Master/Usertypes']")
		WebElement usertype;
    public Home_page(WebDriver driver)throws Throwable
    {
    	PageFactory.initElements(driver,this);
    }
    public  Inventory inventory() throws Throwable
    {
    	Utils.moveToElement(Inventory);
    	AllInventory.click();	 
		return  new Inventory();
    }
    public void movestock()
    {
    	Utils.moveToElement(Inventory);
    	Movestock.click();
    }
 
	public void usertype() {
    	Utils.moveToElement(master);
    	usertype.click();
	}
 
}
