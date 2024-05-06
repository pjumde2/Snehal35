package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AccountsPage;

public class Accounts extends DriverFactory{

	@Given("I open Browser and enter SalesOps Url")
	public void i_open_browser_and_enter_sales_ops_url() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(18000);
		
	}
	@When("I click on any MAD Code")
	public void i_click_on_any_mad_code() throws InterruptedException {
	    
		driver.findElement(AccountsPage.MadCode).click();
	}
	
	@When("I enter {string} in Company Name testbox")
	public void i_enter_in_company_name_testbox(String CompanyName) throws InterruptedException {
	    
		driver.findElement(AccountsPage.CompanyName).sendKeys(CompanyName);
		Thread.sleep(5000);
	}
	@Then("Records should diplay")
	public void records_should_diplay() {
	    
	}
	
	@When("I enter {string} in Account Id testbox")
	public void i_enter_in_account_id_testbox(String AccountId) throws InterruptedException {
	    driver.findElement(AccountsPage.AccountId).sendKeys(AccountId);
	    Thread.sleep(5000);
	}
	
	@When("I enter {string} in MAD Code testbox")
	public void i_enter_in_mad_code_testbox(String MAD) throws InterruptedException {
	   
		driver.findElement(AccountsPage.Mad).sendKeys(MAD);
		Thread.sleep(4000);
	}
	
	@When("I enter {string} in City testbox")
	public void i_enter_in_city_testbox(String City) throws InterruptedException {
	    
		driver.findElement(AccountsPage.City).sendKeys(City);
		Thread.sleep(5000);
	}
	
	@When("I enter {string} in Address testbox")
	public void i_enter_in_address_testbox(String Address) throws InterruptedException {
	    driver.findElement(AccountsPage.Address).sendKeys(Address);
	    Thread.sleep(5000);
	}
	
	@When("I enter {string} in Zip Code testbox")
	public void i_enter_in_zip_code_testbox(String Zip) throws InterruptedException {
	    driver.findElement(AccountsPage.Zip).sendKeys(Zip);
	    Thread.sleep(5000);
	}
	
	@When("I select state {string}")
	public void i_select_state(String State) throws InterruptedException {
	    driver.findElement(AccountsPage.StateDropdown).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-911']")).click();
	    Thread.sleep(5000);
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
