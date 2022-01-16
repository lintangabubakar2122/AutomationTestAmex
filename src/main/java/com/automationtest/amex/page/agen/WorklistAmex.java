package com.automationtest.amex.page.agen;

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

public class WorklistAmex {
	
private WebDriver driver;
	
	public WorklistAmex() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#sidebar > div > div > ul > li")
	private List<WebElement> btnWorklist;
	
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li")
	private List<WebElement> btnAddnewdata;
	
	//isi data
	@FindBy(id="merchant_name")
	private WebElement textMerchantname;
	
	@FindBy(id="category")
	private WebElement textCategory;	
	
	@FindBy(id="city")
	private WebElement textCity;
	
	@FindBy(id="mall")
	private WebElement textMall;
	
	@FindBy(id="address")
	private WebElement textAddress;
	
	@FindBy(id="pic")
	private WebElement textPic;
	
	@FindBy(id="no_telp")
	private WebElement textNotelp;
	
	@FindBy(id="have_edc_bca")
	private WebElement textHaveedcbca;
	
	@FindBy(id="mid")
	private WebElement textMid;
	
	@FindBy(id="posm")
	private WebElement textPosmworklist;
	
	@FindBy(id="awareness")
	private WebElement textAwareness;
	
	@FindBy(css="#form_add > div:nth-child(13) > div > button.btn.btn-sm.btn-primary")
	private WebElement btnSubmitworklist;
	
	//pembatas worklist add
	
	@FindBy(id="upload1")
	private WebElement btnUpload1;
	
	@FindBy(id="upload2")
	private WebElement btnUpload2;
	
	@FindBy(id="upload3")
	private WebElement btnUpload3;
	
	@FindBy(css="#content > div.row > div.col-lg-12.ui-sortable > div:nth-child(2) > div.panel-body > div > a")
	private WebElement btnAddtid;
	
	@FindBy(id="tid")
	private WebElement textTid;
	
	@FindBy(id="edc_test")
	private WebElement textEdc;
	
	@FindBy(id="place_posm")
	private WebElement textPosm;
	
	@FindBy(id="posm_placed1")
	private WebElement checkPosm;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	@FindBy(css="#content > div.row > div.col-lg-12.ui-sortable > div:nth-child(2) > div.panel-body > div > table > tbody > tr > td:nth-child(6) > a.btn.btn-warning.btn-xs > i")
	private WebElement btnUploadtid;
	
	@FindBy(id="jenis_foto")
	private WebElement btnJenisphoto;
	
	@FindBy(id="edc_photo")
	private WebElement btnEdcphoto;
	
	@FindBy(id="btnUpload")
	private WebElement btnUploadedcphoto;
	
	@FindBy(css="#content > button")
	private WebElement btnSubmit;
	
	//
	
	@FindBy(css="#content > div.row > div.col-lg-12.ui-sortable > div:nth-child(2) > div.panel-body > div > table > tbody > tr > td:nth-child(6) > a.btn.btn-warning.btn-xs > i")
	private WebElement btnUploadtid2;
	
	@FindBy(id="jenis_foto")
	private WebElement btnJenisphoto2;
	
	@FindBy(id="edc_photo")
	private WebElement btnStrukphoto;
	
	@FindBy(id="btnUpload")
	private WebElement btnUploadedcphoto2;
	
	@FindBy(css="#content > button")
	private WebElement btnSubmit2;
	
	@FindBy(css="#sidebar > div > div > ul > li")
	private List<WebElement> btnLogout;
	
	
	//-----------------------
	

	
	public void worklist() {
		btnWorklist.get(2).click();
		btnAddnewdata.get(2).click();
	}
	
	public void newdata1() {
		textMerchantname.sendKeys("Bakmi Jawa");
	}
	
	public void newdata2(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textCategory.click();
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
	
	public void newdata3(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textCity.click();
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
	
	public void newdata4(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textMall.click();
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
	
	public void newdata5() {
		textAddress.sendKeys("Blok A");
		textPic.sendKeys("WAML");
		textNotelp.sendKeys("0812121212");
	}
	
	public void newdata6(int selection) {
		textHaveedcbca.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
		textMid.sendKeys("200000");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");

	}
	
	public void newdata7(int selection) {
		textPosmworklist.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs2 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown2 = new Actions(driver); keyDown2.sendKeys(Keys.chord(cs2)).perform();
	}
	
	public void newdata8(int selection) {
		textAwareness.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs3 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown3 = new Actions(driver); keyDown3.sendKeys(Keys.chord(cs3)).perform();
		btnSubmitworklist.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}
	
	
	// pembatas worklist
	
	
	public void uploadPhoto() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		btnUpload1.sendKeys("C:\\Users\\Lenovo Ideapad\\Downloads\\PT. DIKA\\BackgroundJC.jpg");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload2.sendKeys("C:\\Users\\Lenovo Ideapad\\Downloads\\PT. DIKA\\BackgroundJC - 0.jpg");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo( ).alert( ).accept();
		jse.executeScript("window.scrollBy(0,500)");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload3.sendKeys("C:\\Users\\Lenovo Ideapad\\Downloads\\PT. DIKA\\BackgroundJC - 1.jpg");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo( ).alert( ).accept();
	}
	
	public void uploadTid() {
		btnAddtid.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textTid.sendKeys("AB200000");		
	}
	
	public void uploadEdc (int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textEdc.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
	}
	
	public void uploadPosm (int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		textPosm.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
	}
	
	public void checkPosm () {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		checkPosm.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSave.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}
	
	public void uploadPhotoedc(int selection) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUploadtid.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnJenisphoto.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
		}
	
	public void uploadPhotoedc2() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnEdcphoto.sendKeys("C:\\Users\\Lenovo Ideapad\\Downloads\\PT. DIKA\\BackgroundJC.jpg");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUploadedcphoto.click();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
	}
	

	public void uploadPhotostruk(int selection) {
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUploadtid2.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnJenisphoto2.click();
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs1 = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
	}
	
	public void uploadPhotostruk2() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnStrukphoto.sendKeys("C:\\Users\\Lenovo Ideapad\\Downloads\\PT. DIKA\\BackgroundJC.jpg");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUploadedcphoto2.click();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSubmit.click();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnLogout.get(5).click();
	}

}
