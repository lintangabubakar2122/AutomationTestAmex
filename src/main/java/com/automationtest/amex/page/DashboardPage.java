package com.automationtest.amex.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationtest.amex.driver.DriverSingleton;

public class DashboardPage {
	
private WebDriver driver;
	
	public DashboardPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#datepicker-autoClose4 > input")
	private WebElement dateBox;
	
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > thead > tr:nth-child(2) > th.datepicker-switch")
	private WebElement dateYears;
	
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-months > table > tbody > tr > td > span.month.focused")
	private WebElement dateMonth;
	
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(4) > td.today.day")
	private WebElement dateDays;
	
	@FindBy(css="#btn-filter")
	private WebElement btnFilter;
	
	@FindBy(css="#data-monitoring_filter > label > input")
	private WebElement txtSearch;
	
	@FindBy(css="#data-monitoring > tbody > tr.group > td:nth-child(1) > b > a > i")
	private WebElement btnDetail;
	
	@FindBy(css="#datatables_area > tbody > tr:nth-child(1) > td:nth-child(1) > b > a > i")
	private WebElement btnpluscompleted;
	
	@FindBy(css="#datatables_area > tbody > tr:nth-child(9) > td:nth-child(1) > b > a > i")
	private WebElement btnplussedangberjalan;
	
	@FindBy(css="#datatables_area > tbody > tr:nth-child(35) > td:nth-child(1) > b > a > i")
	private WebElement btnplusbelumberjalan;
	
	 public void periode(){
		 	try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 	JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)");
	        dateBox.click();
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        dateYears.click();
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        dateMonth.click();
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        dateDays.click();
	    }
	 
	 public void searchDashboard(){
		 	try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 	txtSearch.sendKeys("bandung");
		 	try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 	txtSearch.sendKeys(Keys.ENTER);
		 	try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 	JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,300)");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnDetail.click();
	    }
	 
	 public void statusDashboardcity() {
		 try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,20000)");
		 try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		btnpluscompleted.click();
		jse.executeScript("window.scrollBy(0,20000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnplussedangberjalan.click();
		jse.executeScript("window.scrollBy(0,20000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnplusbelumberjalan.click();
		jse.executeScript("window.scrollBy(0,20000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }

}
