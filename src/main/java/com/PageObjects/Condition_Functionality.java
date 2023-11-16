package com.PageObjects;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Condition_Functionality extends Testbase{

	public Condition_Functionality() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	//condition name
    @FindBy(id="ConditionName")
    WebElement Conditionname;
    //save
    @FindBy(xpath="//button[contains(@class,'btn-success')]")
    WebElement save;
    public Condition_Functionality(WebDriver driver)throws Throwable
    {
    	PageFactory.initElements(driver,this);
    }
    JavascriptExecutor jse=(JavascriptExecutor)driver;
	 
    public Condition_Functionality addCondition(String conditionname) throws Throwable
    {
    	Conditionname.sendKeys(conditionname);
    	jse.executeScript("arguments[0].click()",save);
		return new Condition_Functionality();  	
    }
    public Condition_Functionality editcondition(String Editedname) throws Throwable
    {
    	Conditionname.clear();
    	Conditionname.sendKeys(Editedname);
    	 jse.executeScript("arguments[0].click()",save);
		return new Condition_Functionality();
    }
    
}