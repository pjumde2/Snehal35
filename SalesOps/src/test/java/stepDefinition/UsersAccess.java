package stepDefinition;

import driver.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.UsersAccessPage;

public class UsersAccess extends DriverFactory{

	//Search with Company Name
	@When("click on Record Edit button")
	public void click_on_record_edit_button() throws InterruptedException {
	    driver.findElement(UsersAccessPage.Edit).click();
	    Thread.sleep(4000);
	}
	@When("I enter {string} in Company Name testbox on Add\\/Remove User Access Page")
	public void i_enter_in_company_name_testbox_on_add_remove_user_access_page(String Company) throws InterruptedException {
	    driver.findElement(UsersAccessPage.Company).sendKeys(Company);
	    Thread.sleep(4000);
	}
	@Then("Location Records should diplay with {string}")
	public void location_records_should_diplay_with(String Exp) {
	    String Actual=driver.findElement(UsersAccessPage.CompanyRecord).getText();
	    Exp.contains(Actual);
	}
	
	//search with Account Id
	@When("I enter {string} in Account Id testbox on Add\\/Remove User Access Page")
	public void i_enter_in_account_id_testbox_on_add_remove_user_access_page(String AccountId) throws InterruptedException {
	    driver.findElement(UsersAccessPage.AccountId).sendKeys(AccountId);
	    Thread.sleep(2000);
	}
	@Then("Account ID Records should diplay with {string}")
	public void account_id_records_should_diplay_with(String string) {
	    
	}
	
	//search with MAD Code
	@When("I enter {string} in MAD Code testbox on Add\\/Remove User Access Page")
	public void i_enter_in_mad_code_testbox_on_add_remove_user_access_page(String MAD) throws InterruptedException {
	    driver.findElement(UsersAccessPage.Mad).sendKeys(MAD);
	    Thread.sleep(2000);
		
	}
	@Then("MAD Code Records should diplay with {string}")
	public void mad_code_records_should_diplay_with(String Exp) {
	    String Actual=driver.findElement(UsersAccessPage.MadRecord).getText();
	    Exp.contains(Actual);
	}
	
	//Search with City
	@When("I enter {string} in City testbox on Add\\/Remove User Access Page")
	public void i_enter_in_city_testbox_on_add_remove_user_access_page(String City) throws InterruptedException {
	    driver.findElement(UsersAccessPage.City).sendKeys(City);
	    Thread.sleep(2000);
	}
	@Then("Records should diplay with City as {string}")
	public void records_should_diplay_with_city_as(String Exp) {
	   String Actual=driver.findElement(UsersAccessPage.CityRecord).getText();
	   Exp.contains(Actual);
	}
	
	//Search with Address
	@When("I enter {string} in Address testbox on Add\\/Remove User Access Page")
	public void i_enter_in_address_testbox_on_add_remove_user_access_page(String Address) throws InterruptedException {
	    driver.findElement(UsersAccessPage.Address).sendKeys(Address);
	    Thread.sleep(2000);
	}
	@Then("Records should diplay with Address as {string}")
	public void records_should_diplay_with_address_as(String Exp) {
	    String Actual=driver.findElement(UsersAccessPage.AddressRecord).getText();
	    Exp.contains(Actual);
	}
	
	//search with Zip
	@When("I enter {string} in Zipcode testbox on Add\\/Remove User Access Page")
	public void i_enter_in_zipcode_testbox_on_add_remove_user_access_page(String Zip) throws InterruptedException {
	    driver.findElement(UsersAccessPage.zip).sendKeys(Zip);
	    Thread.sleep(2000);
		
	}
	@Then("Records should diplay with zipcode as {string}")
	public void records_should_diplay_with_zipcode_as(String Exp) {
	    String Actual=driver.findElement(UsersAccessPage.ZipRecord).getText();
	    Exp.contains(Actual);
	}
	
	//Add  & Remove Locations
	@When("Select the Locations")
	public void select_the_locations() throws InterruptedException {
		Thread.sleep(4000);
	    driver.findElement(UsersAccessPage.location).click();
	    
	}
	@When("Add the Locations")
	public void add_the_locations() throws InterruptedException {
	    driver.findElement(UsersAccessPage.AddLocation).click();
	    Thread.sleep(3000);
	}
	@Then("Check Locations are added")
	public void check_locations_are_added() throws InterruptedException {
	    driver.findElement(UsersAccessPage.Save).click();
	    Thread.sleep(3000);
	}

	@When("Remove the Location")
	public void remove_the_location() throws InterruptedException {
	    driver.findElement(UsersAccessPage.Relocations).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersAccessPage.RemoveLocation).click();
	    Thread.sleep(2000);
	}
		
	@When("Click on Save and Submit button")
	public void click_on_save_and_submit_button() throws InterruptedException {
	   Thread.sleep(2000);
	   driver.findElement(UsersAccessPage.SaveSubmit).click();
	   Thread.sleep(6000);
	}

	@Then("Check Locations are Removed")
	public void check_locations_are_removed() {
	    
	}

	//Reset Locations
	
	@When("click on Reset button")
	public void click_on_reset_button() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.findElement(UsersAccessPage.Reset).click();
	    Thread.sleep(3000);
	}
	@Then("Check Locations are Reset")
	public void check_locations_are_reset() {
	    
	}
	
	//Duplicate Location
	@When("I entered {string} in Company Name testbox on Add\\/Remove User Access Page")
	public void i_entered_in_company_name_testbox_on_add_remove_user_access_page(String Company) throws InterruptedException {
	    driver.findElement(UsersAccessPage.DuplicateCompany).sendKeys(Company);
	    Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
}
