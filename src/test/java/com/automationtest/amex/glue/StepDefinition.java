package com.automationtest.amex.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.automationtest.amex.config.AutomationFrameworkConfiguration;
import com.automationtest.amex.driver.DriverSingleton;
import com.automationtest.amex.page.DashboardPage;
import com.automationtest.amex.page.LoginPage;
import com.automationtest.amex.page.MasterPage;
import com.automationtest.amex.page.ReportPage;
import com.automationtest.amex.page.ValidationPage;
import com.automationtest.amex.page.agen.LoginAmex;
import com.automationtest.amex.page.agen.WorklistAmex;
import com.automationtest.amex.utils.ConfigurationProperties;
import com.automationtest.amex.utils.Constants;
import com.automationtest.amex.utils.Log;
import com.automationtest.amex.utils.TestCases;
import com.automationtest.amex.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;



@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	
	
	private WebDriver driver;
	private LoginAmex loginAmex;
	private WorklistAmex worklistAmex;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private MasterPage masterPage;
	private ValidationPage validationPage;
	private ReportPage reportPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginAmex = new LoginAmex();
		worklistAmex = new WorklistAmex();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		masterPage = new MasterPage();
		validationPage = new ValidationPage();
		reportPage = new ReportPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	// Scenario Login Amex
			@Given("^User go to the Websitee")
			public void user_go_to_the_Websitee() {
				driver = DriverSingleton.getDriver();
				driver.get(Constants.URL);
				Log.info("INFO: Navigating to " + Constants.URL); //log4j
				extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
			}
			@When("^User input username password and click Loginn")
			public void user_input_username_password_and_click_Loginn(){
				loginAmex.goToLoggedIn();
				extentTest.log(LogStatus.PASS, "User input username password and click Loginn");
			}
			@Then("^User can login to the Websitee")
			public void user_can_login_to_the_Websitee() {
				 extentTest.log(LogStatus.PASS, "User can login to the Websitee");
			}
			
	// Scenario Worklist Amex
			@When("^User click to worklist button and submenu add new data")
			public void User_click_to_worklist_button_and_submenu_add_new_data() {
				worklistAmex.worklist();
				extentTest.log(LogStatus.PASS, "User click to worklist button and submenu add new data");
			}
			
			@And("^Input the worklist form as stated and click submit")
			public void Input_the_worklist_form_as_stated_and_click_submit() {
				worklistAmex.newdata1();
				worklistAmex.newdata2(4);
				worklistAmex.newdata3(2);
				worklistAmex.newdata4(1);
				worklistAmex.newdata5();
				worklistAmex.newdata6(1);
				worklistAmex.newdata7(1);
				worklistAmex.newdata8(1);
				extentTest.log(LogStatus.PASS, "Input the worklist form as stated and click submit");
			}
			
			@And("^Input the visit merchant form as stated and click submit")
			public void Input_the_visit_merchant_form_as_stated_and_click_submit() {
				worklistAmex.uploadPhoto();
				worklistAmex.uploadTid();
				worklistAmex.uploadEdc(2);
				worklistAmex.uploadPosm(1);
				worklistAmex.checkPosm();
				worklistAmex.uploadPhotoedc(1);
				worklistAmex.uploadPhotoedc2();
				worklistAmex.uploadPhotostruk(2);
				worklistAmex.uploadPhotostruk2();
				extentTest.log(LogStatus.PASS, "Input the visit merchant form as stated and click submit");
			}

			@Then("^User successful completion worklist and click logout")
			public void User_successful_completion_worklist_and_click_logout() {
				extentTest.log(LogStatus.PASS, "User successful completion worklist and click logout");
			}

			
	// Scenario Login Admin
		@Given("^User go to the Website")
		public void user_go_to_the_Website() {
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URL);
			Log.info("INFO: Navigating to " + Constants.URL); //log4j
			extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
		}
		@When("^User input username password and click Login")
		public void user_input_username_password_and_click_Login(){
			loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
			extentTest.log(LogStatus.PASS, "User input username password and click Login");
			
		}
		@Then("^User can login to the Website")
		public void user_can_login_to_the_Website() {
			 assertEquals(configurationProperties.getDisplayName(), loginPage.getDisplayName());
			 extentTest.log(LogStatus.PASS, "User can login to the Website");
		}
		
	//Skenario Dashboard Admin
		
		@When("^User succes go to dashboard page")
		public void User_succes_go_to_dashboard_page() {
			extentTest.log(LogStatus.PASS, "User succes go to dashboard page");
		}
		
		@And("^User click periode and filter")
		public void User_click_periode_and_filter() {
			dashboardPage.periode();
			extentTest.log(LogStatus.PASS, "User click periode and filter");
		}
		
		@And("^User types the city in the search field and click search")
		public void User_types_the_city_in_the_search_field_and_click_search() {
			dashboardPage.searchDashboard();
			extentTest.log(LogStatus.PASS, "User types the city in the search field and click search");
		}
		
		@And("^User clicks all details on city status data")
		public void User_clicks_all_details_on_city_status_data() {
			dashboardPage.statusDashboardcity();
			extentTest.log(LogStatus.PASS, "User clicks all details on city status data");
		}

		@Then("^User success testing dashboard")
		public void User_success_testing_dashboard() {
			extentTest.log(LogStatus.PASS, "User success testing dashboard");
		}
		
		
		
		
	// Scenario Master Admin
		
		@When("^User succes go to master page")
		public void User_succes_go_to_master_page() {
			extentTest.log(LogStatus.PASS, "User succes go to master page");
		}
		
		@And("^User add account edit and delete")
		public void User_add_account_edit_and_delete() {
			masterPage.masterUser();
			masterPage.addnewUser1();
			masterPage.addnewUser2(1);
			masterPage.editUser();
			masterPage.editUser1(2);
			masterPage.deleteUser();
			extentTest.log(LogStatus.PASS, "User add account edit and delete");
		}
		
		@And("^User search area and edit")
		public void User_search_area_and_edit() {
			masterPage.masterArea();
			masterPage.masterAreaedit(1);
			extentTest.log(LogStatus.PASS, "User search area and edit");
		}
		
		@And("^User add mall search edit and delete")
		public void User_add_mall_search_edit_and_delete() {
			masterPage.masterMall();
			masterPage.addnewMall1();
			masterPage.addnewMall2(1);
			masterPage.addnewMall3();
			masterPage.masterMallsearch();
			masterPage.masterMalledit(1);
			masterPage.masterMalldelete();
			extentTest.log(LogStatus.PASS, "User add mall search edit and delete");
		}
		
		@And("^User edit posm")
		public void User_edit_posm() {
			masterPage.masterPOSM();
			masterPage.masterEditposm();
			extentTest.log(LogStatus.PASS, "User edit posm");
		}
		
		@Then("^User success testing master")
		public void User_success_testing_master() {
			extentTest.log(LogStatus.PASS, "User success testing master");
		}
		
		
	// Scenario Validation Admin
		
		@When("^User click to validation button")
		public void User_click_to_validation_button() {
			validationPage.validation();
			extentTest.log(LogStatus.PASS, "User click to validation button");
		}
		
		@And("^User filter validation search and validate")
		public void User_filter_validation_search_and_validate() {
			validationPage.filterValidation(2);
			validationPage.searchValidation();
			validationPage.validateValidation();
			extentTest.log(LogStatus.PASS, "User filter validation search and validate");
		}

		@Then("^User success testing validation")
		public void User_success_testing_validation() {
			extentTest.log(LogStatus.PASS, "User success testing validation");
		}		
		
		
		
	// Scenario Report Admin
		
		@When("^User click to report button")
		public void User_click_to_report_button() {
			reportPage.report();
			extentTest.log(LogStatus.PASS, "User click to report button");
		}
		
		@And("^Input the form as stated and click process and click logout")
		public void Input_the_form_as_stated_and_click_process_and_click_logout() {
			reportPage.kategorimerchant(2);
			reportPage.kategoriedc(2);
			reportPage.date();
			extentTest.log(LogStatus.PASS, "Input the form as stated and click process and click logout");
		}

		@Then("^User get file report and out from system")
		public void User_get_file_report_and_out_from_system() {
			extentTest.log(LogStatus.PASS, "User get file report and out from system");
		}
		
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}


}
