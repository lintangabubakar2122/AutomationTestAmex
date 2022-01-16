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

public class ValidationPage {
	
private WebDriver driver;
	
	public ValidationPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#sidebar > div > div > ul > li")
	private List<WebElement> btnValidation;
	
	@FindBy(id="City")
	private WebElement textFiltervalidation;
	
	@FindBy(id="btn-filter")
	private WebElement btnFiltervalidation;
	
	@FindBy(css="#data-worklist_filter > label > input")
	private WebElement textSearchvalidation;
	
	@FindBy(id="btnApproved")
	private WebElement btnValidatevalidation;
	
	
	public void validation() {
		btnValidation.get(4).click();
	}
	
	public void filterValidation(int selection) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textFiltervalidation.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		btnFiltervalidation.click();
	}
	
	public void searchValidation() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textSearchvalidation.sendKeys("bakmi");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textSearchvalidation.sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
	
	public void validateValidation() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnValidatevalidation.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}

}
