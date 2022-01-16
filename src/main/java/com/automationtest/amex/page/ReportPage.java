package com.automationtest.amex.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationtest.amex.driver.DriverSingleton;
import com.automationtest.amex.utils.Utils;

public class ReportPage {
	
private WebDriver driver;
	
	public ReportPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#sidebar > div > div > ul > li")
	private List<WebElement> btnReport;
	
	@FindBy(id="kategori")
	private WebElement textKategorimerchant;
	
	@FindBy(id="kategori_edc")
	private WebElement textKategoriedc;

	@FindBy(id="datepicker-autoClose")
	private WebElement textStartdate;
	
	@FindBy(id="datepicker-autoClose2")
	private WebElement textEnddate;
	
	@FindBy(css="#content > div > div > div > div.panel-body > div > form > fieldset > div.pull-right > input")
	private WebElement textProcesstanpamerge;

	@FindBy(css="#content > div > div > div > div.panel-body > div > form > fieldset > div.pull-right > button")
	private WebElement textProcess;
	
	
	public void report() {
		btnReport.get(6).click();
	}
	
	public void kategorimerchant(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textKategorimerchant.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void kategoriedc(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textKategoriedc.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	
	public void date() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		textStartdate.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textStartdate.sendKeys("20-11-01");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		textEnddate.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textEnddate.sendKeys("20-11-01");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textProcesstanpamerge.click();
		try {
			Thread.sleep(15000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		textProcess.click();
		Utils.takeScreenshot();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnReport.get(8).click();
	}

}
