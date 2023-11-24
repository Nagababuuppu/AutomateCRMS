package com.PageObjects;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.Testbase;

	public class Shiftsinformation extends Testbase{

		public Shiftsinformation() throws Throwable {
			super();
		}
		//shiftname
		@FindBy(id="ShiftName")
		WebElement ShiftName;
		//starttime
		@FindBy(name="StartTime")
		WebElement StartTime;
		//end time
		@FindBy(name="EndTime")
		WebElement EndTime;
		//save
		@FindBy(xpath="//button[text()=' Save']")
		WebElement save;
	    public Shiftsinformation(WebDriver driver)throws Throwable
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    public  ShiftTimings addShift() throws Throwable
	    {
	    	ShiftName.sendKeys(props.getProperty("shiftname"));
	    	StartTime.sendKeys(props.getProperty("starttime"));
	    	EndTime.sendKeys(props.getProperty("endtime"));
	    	save.click();
	    	return new ShiftTimings();
	    	
	    }
	}

