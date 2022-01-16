package com.automationtest.amex.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationtest.amex.driver.DriverSingleton;

public class MasterPage {
	
private WebDriver driver;
	
	public MasterPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	// User
	
		@FindBy(css="#sidebar > div > div > ul > li")
		private List<WebElement> btnMaster;
		
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li")
		private List<WebElement> btnUser;
		
		@FindBy(css="#content > div.row > div.col.col-lg-12 > div > a > i")
		private WebElement btnAddnewuser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > div:nth-child(1) > div > input")
		private WebElement textNikuser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > div:nth-child(2) > div > input")
		private WebElement textNameuser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > div:nth-child(3) > div > input")
		private WebElement textUsernameuser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > div:nth-child(4) > div > input")
		private WebElement textPassworduser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > div:nth-child(5) > div > select")
		private WebElement textPrivilageuser;
		
		@FindBy(css="#modalAdd > div > div > div.modal-body > form > fieldset > button.btn.btn-sm.btn-primary.m-r-5")
		private WebElement btnSavenewuser;
		
		@FindBy(css="#data-table-default_filter > label > input")
		private WebElement testSearchuser;
		
		@FindBy(css="#data-table-default > tbody > tr:nth-child(1) > td.sorting_1")
		private WebElement btnOpenuser;
		
		@FindBy(css="#pop > form > fieldset > div:nth-child(4) > div > select")
		private WebElement textDeactiveuser;
		
		@FindBy(css="#pop > form > fieldset > button")
		private WebElement btnSaveedituser;
		
		//Area
		
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li")
		private List<WebElement> btnArea;
		
		@FindBy(css="#data-table-default_filter > label > input")
		private WebElement btnSearcharea;
		
		@FindBy(id="active")
		private WebElement btnActivearea;
		
		@FindBy(css="#pop > form > fieldset > button")
		private WebElement btnSaveeditarea;
		
		//Mall
		
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li")
		private List<WebElement> btnMall;
		
		@FindBy(css="#content > div.row > div:nth-child(1) > div > a")
		private WebElement btnAddnewmall;
		
		@FindBy(id="city")
		private WebElement textCitymall;

		@FindBy(id="mall_name")
		private WebElement textNamemall;
		
		@FindBy(id="btnSave")
		private WebElement btnSavenewmall;
		
		@FindBy(css="#data-mall_filter > label > input")
		private WebElement btnSearchmall;
		
		@FindBy(id="city")
		private WebElement textCitymalledit;
		
		@FindBy(id="btnSave")
		private WebElement btnSaveeditmall;
		
		//POSM
		
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li")
		private List<WebElement> btnPOSM;
		
		@FindBy(css="#data-table-default\\ table-responsive > tbody > tr:nth-child(1) > td:nth-child(4) > a.btn.btn-success.btn-xs > i")
		private WebElement btnEditposm;
		
		@FindBy(css="#data-table-default > tbody > tr:nth-child(1) > td:nth-child(5) > a > i")
		private WebElement btnEditposmstock;
		
		@FindBy(css="#pop > form > fieldset > button")
		private WebElement btnSaveeditposm;
		
		//Pembatas
		
		// USer
		
		public void masterUser() {
			btnMaster.get(3).click();
			btnUser.get(0).click();
			btnAddnewuser.click();
		}
		
		public void addnewUser1() {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textNikuser.sendKeys("D000002");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textNameuser.sendKeys("buserbusera");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textUsernameuser.sendKeys("buserbusera");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textPassworduser.sendKeys("buserbusera");
		}
		
		public void addnewUser2(int selection) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textPrivilageuser.click();
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				 lstSequence.add(Keys.DOWN);
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSavenewuser.click();
		}
		
		public void editUser() {
			Actions action = new Actions(driver);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			testSearchuser.sendKeys("d0000");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnOpenuser.click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnOpenuser.sendKeys(Keys.TAB);
			driver.switchTo().activeElement().click();
		}
		
		public void editUser1(int selection) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textDeactiveuser.click();
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				 lstSequence.add(Keys.DOWN);
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSaveedituser.click();
		}
		
		public void deleteUser() {
			Actions action = new Actions(driver);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			testSearchuser.sendKeys("d0000");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnOpenuser.click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnOpenuser.sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.switchTo().alert().accept();
		}
		
		// area
		
		public void masterArea() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnMaster.get(3).click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnArea.get(1).click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSearcharea.sendKeys("Test");
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().click();
		}
		
		public void masterAreaedit(int selection) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnActivearea.click();
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				 lstSequence.add(Keys.DOWN);
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSaveeditarea.click();
		}
		
		//Mall
		
		public void masterMall() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnMaster.get(3).click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnMall.get(2).click();
		}
		
		public void addnewMall1() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnAddnewmall.click();
		}
		
		public void addnewMall2(int selection) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textCitymall.click();
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				 lstSequence.add(Keys.DOWN);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
		}
		
		public void addnewMall3() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textNamemall.sendKeys("AAA");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSavenewmall.click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.switchTo().alert().accept();
		}
		
		public void masterMallsearch () {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSearchmall.sendKeys("AAA");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSearchmall.sendKeys(Keys.ENTER);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().click();
		}
		
		public void masterMalledit(int selection) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			textCitymalledit.click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			List<Keys> lstSequence = new ArrayList<Keys>();
			for (int i = 0; i < selection; i++) {
				 lstSequence.add(Keys.DOWN);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			lstSequence.add(Keys.ENTER);
			CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSaveeditmall.click();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.switchTo().alert().accept();
		}
		
		public void masterMalldelete() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnSearchmall.sendKeys(Keys.ENTER);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			driver.switchTo().activeElement().click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.switchTo().alert().accept();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.switchTo().alert().accept();
		}
		
		//posm
		
		public void masterPOSM() {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnMaster.get(3).click();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnPOSM.get(3).click();
		}
		
		public void masterEditposm() {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnEditposm.click();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			btnEditposmstock.click();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			btnSaveeditposm.click();
		}

}
