package com.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjects.Home_page;
import com.PageObjects.Inventory;
import com.PageObjects.Login_functionality;
import com.Utils.Utils;
import com.base.TestBase;

public class Inventory_Test extends TestBase {
	 private final String sheet="Addingproduct";
 Login_functionality lf;
 Home_page h; 
 Inventory i;
	public Inventory_Test() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod

	public void setup() throws Throwable {

		Initialization();
		 lf = new Login_functionality(driver);
		 h=new Home_page(driver);
		 i=new Inventory(driver);	 
	    
	}
  @DataProvider
   public Object[][] getdata() throws IOException{
	   return Utils.readDataFromExcel(sheet);
   }
    @Test(dataProvider="getdata",dataProviderClass=Inventory_Test.class)
    public void addProduct(String Category,String ModelNumber,String Title,String ItemDescription,String Brand,String Height,String Width,String Breadth,String Color,String InventoryStatus,String InventoryCondition,String InventoryLocation,String RDate,String ActPrice,String Mrp,String HSNcode,String RName,String PODetails,String InvoiceNo,String quantity) throws Throwable
    {
    	 lf.Dologin();
    	h.inventory();
   	i.AddProduct(Category,ModelNumber,Title,ItemDescription,Brand,Height,Width,Breadth,Color,InventoryStatus,InventoryCondition,InventoryLocation,RDate,ActPrice,Mrp,HSNcode,RName,PODetails,InvoiceNo,quantity);   
    String url=driver.getCurrentUrl();
    Assert.assertEquals(url,"http://empirehome.myprojectsonline.co.in/Inventory/All");
    }
    
}
