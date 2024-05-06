package stepDefinition;

import driver.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.UsersPage;

public class Users extends DriverFactory{
	
	@When("I click on User Tab")
	public void i_click_on_user_tab() throws InterruptedException {
	    
		driver.findElement(UsersPage.UserTab).click();
		Thread.sleep(2000);
		
	}
	
	@When("I enter {string} in Users Textbox")
	public void i_enter_in_users_textbox(String user) throws InterruptedException {
	    
		driver.findElement(UsersPage.user).sendKeys(user);
		Thread.sleep(4000);
	}

		
	@Then("Users Records should diplay {string}")
	public void users_records_should_diplay(String Exp) {
		
		String Actual=driver.findElement(UsersPage.userRecord).getText();
		Exp.contains(Actual);
	}
	
	@When("I enter {string} in Name of User Textbox")
	public void i_enter_in_name_of_user_textbox(String userName) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(UsersPage.userName).sendKeys(userName);
	    Thread.sleep(3000);
	
	}
	//UserName Search
	@When("I enter {string} in Username Textbox")
	public void i_enter_in_username_textbox(String UserName) throws InterruptedException {
	    driver.findElement(UsersPage.Username).sendKeys(UserName);
	    Thread.sleep(1000);
	}
	
	@Then("Users Records should diplay with Username {string}")
	public void users_records_should_diplay_with_username(String Exp) {
		   String Actual= driver.findElement(UsersPage.UsernameRecord).getText();
		   Exp.contains(Actual);
	}
	
	//Email Id Search
	@When("I enter {string} in Email Textbox")
	public void i_enter_in_email_textbox(String Email) throws InterruptedException {
	    driver.findElement(UsersPage.EmailId).sendKeys(Email);
	    Thread.sleep(1000);
	}
	@Then("Users Record should diplay with Email Id {string}")
	public void users_record_should_diplay_with_email_id(String Exp) {
		 String Actual= driver.findElement(UsersPage.EmailIdRecord).getText();
		   Exp.contains(Actual);
	}
	
	//Phone Number search
	@When("I enter {string} in Phone Number Textbox")
	public void i_enter_in_phone_number_textbox(String Phone) throws InterruptedException {
	    driver.findElement(UsersPage.PhoneNumber).sendKeys(Phone);
	    Thread.sleep(1000);
	}
	@Then("Users Record should diplay with Phone Number {string}")
	public void users_record_should_diplay_with_phone_number(String Exp) {
		 String Actual= driver.findElement(UsersPage.PhoneNumberRecord).getText();
		   Exp.contains(Actual);
	}
	
	//Zip Code Search
	@When("I enter {string} in Zip Code Textbox")
	public void i_enter_in_zip_code_textbox(String ZipCode) throws InterruptedException {
	   driver.findElement(UsersPage.ZipCode).sendKeys(ZipCode);
	   Thread.sleep(1000);
	}
	@Then("Users Record should diplay with Zip Code {string}")
	public void users_record_should_diplay_with_zip_code(String Exp) {
		String Actual= driver.findElement(UsersPage.ZipCodeRecord).getText();
		   Exp.contains(Actual);
	}
	
	
	//Adding User
	
	@When("I click on Add New User button")
	public void i_click_on_add_new_user_button() throws InterruptedException {
	    driver.findElement(UsersPage.AddNewUser).click();
	    Thread.sleep(5000);
	}
	@When("I enter Email as {string}")
	public void i_enter_email_as(String email) {
	    
		driver.findElement(UsersPage.Email).sendKeys(email);
	}
	@When("I enter First Name as {string}")
	public void i_enter_first_name_as(String Fname) {
	    driver.findElement(UsersPage.FirstName).sendKeys(Fname);
	}
	@When("I enter Last Name as {string}")
	public void i_enter_last_name_as(String Lname) {
	   driver.findElement(UsersPage.LastName).sendKeys(Lname);
	}
	@When("I enter Company Name as {string}")
	public void i_enter_company_name_as(String CompanyName) {
	    driver.findElement(UsersPage.CompanyName).sendKeys(CompanyName);
	}
	@When("I enter Street as {string}")
	public void i_enter_street_as(String Street) {
	    driver.findElement(UsersPage.Street).sendKeys(Street);
	}
	@When("I select Country as {string}")
	public void i_select_country_as(String string) throws InterruptedException {
	    
		driver.findElement(UsersPage.CountryDropdown).click();
	    Thread.sleep(2000);
	    driver.findElement(UsersPage.Country).click();
	}
	@When("I enter City Name as {string}")
	public void i_enter_city_name_as(String City) {
	    driver.findElement(UsersPage.City).sendKeys(City);
	}
	@When("I enter State as {string}")
	public void i_enter_state_as(String State) throws InterruptedException {
		
	    driver.findElement(UsersPage.StateDropdown).click();
	    Thread.sleep(2000);
	    driver.findElement(UsersPage.State).click();
		
	}
	@When("I enter Postal Code as {string}")
	public void i_enter_postal_code_as(String PostalCode) {
	    driver.findElement(UsersPage.PostalCode).sendKeys(PostalCode);
		
	}
	@When("I enter Phone as {string}")
	public void i_enter_phone_as(String Phone) {
	    driver.findElement(UsersPage.Phone).sendKeys(Phone);
		
	}
	@When("I click on Submit button")
	public void i_click_on_submit_button() throws InterruptedException {
	    driver.findElement(UsersPage.Submit).click();
	    Thread.sleep(1000);
		
	}
	
	//Add New User as Shipping Role
	@When("I select Role as {string}")
	public void i_select_role_as(String ShippingOnly) throws InterruptedException {
	    driver.findElement(UsersPage.RoleDropdown).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.ShippinyOnly).click();
	}
	
	@When("I select Role as Shipping And Financial Information")
	public void i_select_role_as_shipping_and_financial_information() throws InterruptedException {
		driver.findElement(UsersPage.RoleDropdown).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.ShippingFinance).click();
	}
	
	@When("I select Role as Custom")
	public void i_select_role_as_custom() throws InterruptedException {
		driver.findElement(UsersPage.RoleDropdown).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.Custome).click();
	}
	
	@When("I select Role as Full Access \\(Admin) display")
	public void i_select_role_as_full_access_admin_display() throws InterruptedException {
		driver.findElement(UsersPage.RoleDropdown).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.Admin).click();
	}
	
	@When("I enter {string} in Company Name testbox for Adding Locations")
	public void i_enter_in_company_name_testbox_for_adding_locations(String Company) throws InterruptedException {
	    driver.findElement(UsersPage.LocationCompany).sendKeys(Company);
	    Thread.sleep(2000);
	}
	
	@When("Select the Locations to Add")
	public void select_the_locations_to_add() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(UsersPage.LocationSelect).click();
	   
	}
	
	@Then("User with Shipping Role display")
	public void user_with_shipping_role_display() {
	    
	}
	
	@Then("User with Role as Shipping And Financial Information display")
	public void user_with_role_as_shipping_and_financial_information_display() {
	    
	}
	
	@Then("User with Role as Custome display")
	public void user_with_role_as_custome_display() {
	   
	}
	
	@Then("User with Role as Full Access \\(Admin) display")
	public void user_with_role_as_full_access_admin_display() {
	    
	}
	
	@When("click on Download button")
	public void click_on_download_button() {
	    driver.findElement(UsersPage.Download).click();
	}

	@Then("Excel with Users Mapping Data Downloaded")
	public void excel_with_users_mapping_data_downloaded() throws InterruptedException {
	    Thread.sleep(5000);
	}
	
	@Then("We get Error Message")
	public void we_get_error_message() {
	    
	}
	
	
	@Then("We get Error Message as {string}")
	public void we_get_error_message_as(String Exp) {
	   String Actual= driver.findElement(UsersPage.EmailError).getText();
	   Exp.contains(Actual);
	}
	
	
	//Edit Exiting Record
	//Edit Email
	

	@When("click on Searched Record")
	public void click_on_searched_record() throws InterruptedException {
		
		driver.findElement(UsersPage.Editbutton).click();
		   Thread.sleep(5000);
	}
	@When("Click on Edit button")
	public void click_on_edit_button() throws InterruptedException {
	    driver.findElement(UsersPage.UserEdit).click();
	    Thread.sleep(3000);
	}
	
	
	@When("Edit Email Id as {string}")
	public void edit_email_id_as(String Email) throws InterruptedException {
	    driver.findElement(UsersPage.EditEmail).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditEmail).sendKeys(Email);
		
	}
	@When("click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		
	    driver.findElement(UsersPage.EditSubmit).click();
		Thread.sleep(4000);
	}

	@Then("Email Id is updated as {string}")
	public void email_id_is_updated_as(String Exp) {
	    
		String Actual=driver.findElement(UsersPage.updateEmail).getText();
		Exp.contains(Actual);
	}
	
	//Edit First Name
	
	@When("Edit First Name as {string}")
	public void edit_first_name_as(String FName) throws InterruptedException {
	    driver.findElement(UsersPage.EditFname).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditFname).sendKeys(FName);
	}
	@Then("First Name is updated as {string}")
	public void first_name_is_updated_as(String Exp) {
	   String Actual= driver.findElement(UsersPage.updateFName).getText();
	   Exp.contains(Actual);
	}
	
	
	//Edit Last Name
	
	@When("Edit Last Name as {string}")
	public void edit_last_name_as(String LName) throws InterruptedException {
	    driver.findElement(UsersPage.EditLname).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditLname).sendKeys(LName);
	}

	@Then("Last Name is updated as {string}")
	public void last_name_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updateFName).getText();
	    Exp.contains(Actual);
	}
	
	//Edit Company Name
	
	@When("Edit Company Name as {string}")
	public void edit_company_name_as(String Company) throws InterruptedException {
	    driver.findElement(UsersPage.EditCompany).clear();
	    Thread.sleep(1000);
		driver.findElement(UsersPage.EditCompany).sendKeys(Company);
	}
	@Then("Company Name is updated as {string}")
	public void company_name_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updateCompany).getText();
	    Exp.contains(Actual);
	}
	
	//Edit Street Name
	
	@When("Edit Street Name as {string}")
	public void edit_street_name_as(String Street) throws InterruptedException {
	    driver.findElement(UsersPage.EditStreet).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditStreet).sendKeys(Street);
	}
	@Then("Street Name is updated as {string}")
	public void street_name_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updateStreet).getText();
	    Exp.contains(Actual);
	}
	
	//Edit City
		
	@When("Edit City Name as {string}")
	public void edit_city_name_as(String City) throws InterruptedException {
	    driver.findElement(UsersPage.EditCity).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditCity).sendKeys(City);
	}
	@Then("City Name is updated as {string}")
	public void city_name_is_updated_as(String Exp) {
	    
	}
	
	//Edit Country Name
	@When("Edit Country Name as {string}")
	public void edit_country_name_as(String string) throws InterruptedException {
	    driver.findElement(UsersPage.EditCountryDropdown).click();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditCountry).click();
	}
	@Then("Country Name is updated as {string}")
	public void country_name_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.UpdateCountry).getText();
	    Exp.contains(Actual);
	}
	
	//Edit State Name
	@When("Edit State Name as {string}")
	public void edit_state_name_as(String string) throws InterruptedException {
	   driver.findElement(UsersPage.EditStateDropdown).click();
	   Thread.sleep(1000);
	   driver.findElement(UsersPage.EditState).click();
	}
	@Then("State Name is updated as {string}")
	public void state_name_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updateState).getText();
	    Exp.contains(Actual);
	}
	
	//Edit Postal Code
	@When("Edit Postal Code as {string}")
	public void edit_postal_code_as(String PostalCode) throws InterruptedException {
	    driver.findElement(UsersPage.EditPostal).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditPostal).sendKeys(PostalCode);
	}

	@Then("Postal Code is updated as {string}")
	public void postal_code_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updatePostal).getText();
	    Exp.contains(Actual);
	}
	
	//Edit Phone Number
	@When("Edit Phone Number as {string}")
	public void edit_phone_number_as(String Phone) throws InterruptedException {
	    driver.findElement(UsersPage.EditPhone).clear();
	    Thread.sleep(1000);
	    driver.findElement(UsersPage.EditPhone).sendKeys(Phone);
	}
	@Then("Phone Number is updated as {string}")
	public void phone_number_is_updated_as(String Exp) {
	    String Actual=driver.findElement(UsersPage.updatePhone).getText();
	    Exp.contains(Actual);
	}
	
	//Edit Role
	@When("Edit Role as {string}")
	public void edit_role_as(String string) throws InterruptedException {
	    driver.findElement(UsersPage.EditRoledropdown).click();
	    Thread.sleep(2000);
	    driver.findElement(UsersPage.EditRole).click();
	}
	@Then("Role is updated as {string}")
	public void role_is_updated_as(String Exp) {
	   String Actual=driver.findElement(UsersPage.updateRole).getText();
	   Exp.contains(Actual);
		
	}
	
	//Activate New Account
	@When("click on Activate button")
	public void click_on_activate_button() throws InterruptedException {
	    	Thread.sleep(3000);	
	    	driver.findElement(UsersPage.Activate).click();
	    	Thread.sleep(2000);
	    	driver.findElement(UsersPage.ActivateConfirm).click();
	    	driver.findElement(UsersPage.ActivateConfirm).click();
	    	Thread.sleep(10000);
	}
	
	@Then("Check Account is Activated")
	public void check_account_is_activated() {
	    
	}
	
	//Set Password
	@When("click on Set Password button")
	public void click_on_set_password_button() throws InterruptedException {
	    driver.findElement(UsersPage.SetPasswordButton).click();
	    Thread.sleep(2000);
	}
	  
	@When("Entered Password {string}")
	public void entered_password(String Password) {
	   driver.findElement(UsersPage.Password).sendKeys(Password);
	}
	@When("Entered Confirm Password {string}")
	public void entered_confirm_password(String ConfirmPassword) {
	    driver.findElement(UsersPage.ConfirmPassword).sendKeys(ConfirmPassword);
	}
	@When("clicked on Set Password button")
	public void clicked_on_set_password_button() throws InterruptedException {
	    driver.findElement(UsersPage.Setpassword).click();
	    Thread.sleep(3000);
	}
	
	@Then("Password get Set Up Successfully")
	public void password_get_set_up_Successfully() {
	    
	}
	
	//Reset Password
	@When("click on Reset Password button")
	public void click_on_reset_password_button() throws InterruptedException {
	    driver.findElement(UsersPage.ResetPasswordButton).click();
	    Thread.sleep(2000);
	}
	@When("click on Confirm Reset Password")
	public void click_on_confirm_reset_password() throws InterruptedException {
	    driver.findElement(UsersPage.ConfirmResetPassword).click();
	    Thread.sleep(2000);
	}
	@Then("Email Sent to User for Reset Password")
	public void email_sent_to_user_for_reset_password() {
	    
	}
	
	
	//Deactivate Account
	@When("click on Deactivate button")
	public void click_on_deactivate_button() throws InterruptedException {
	   Thread.sleep(6000); 
	   driver.findElement(UsersPage.DeactivateButton).click();
	   Thread.sleep(3000);
	}
	
	@When("click on Confirm Deactivate button")
	public void click_on_confirm_deactivate_button() throws InterruptedException {
	    driver.findElement(UsersPage.ConfirmDeactivate).click();
	    Thread.sleep(3000);
	}
	@Then("User become Deactive")
	public void user_become_deactive() {
	    
	}
}
