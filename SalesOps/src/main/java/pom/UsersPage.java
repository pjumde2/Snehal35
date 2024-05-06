package pom;

import org.openqa.selenium.By;

public class UsersPage {
	
	public static By UserTab=By.xpath("//a[normalize-space()='Users']");
	public static By user=By.xpath("//input[@id='mat-input-6']");
	public static By userRecord=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer-content/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[2]");
	public static By userName=By.xpath("//*[@id=\"ag-486-input\"]");
	
	public static By Username=By.xpath("//*[@id=\"ag-492-input\"]");
	public static By UsernameRecord=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer-content/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[4]");
	public static By EmailId=By.xpath("//*[@id=\"ag-495-input\"]");
	public static By EmailIdRecord=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer-content/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[5]");
	public static By PhoneNumber=By.xpath("//*[@id=\"ag-498-input\"]");
	public static By PhoneNumberRecord=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer-content/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[6]");
	public static By ZipCode=By.xpath("//*[@id=\"ag-501-input\"]");
	public static By ZipCodeRecord=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer-content/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[6]");
	
	
	//Add New Users
	public static By AddNewUser=By.xpath("//span[normalize-space()='Add New User']");
	public static By Email=By.xpath("//input[@id='mat-input-7']");
	public static By FirstName=By.xpath("//input[@id='firstName']");
	public static By LastName=By.xpath("//input[@id='lastName']");
	public static By CompanyName=By.xpath("//input[@id='companyName']");
	public static By Street=By.xpath("//input[@id='mat-input-12']");
	public static By CountryDropdown=By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c215-24']");
	public static By Country=By.xpath("//span[normalize-space()='United States']");
	public static By City=By.xpath("//input[@id='mat-input-14']");
	public static By StateDropdown=By.xpath("//div[@class='mat-select-arrow ng-tns-c215-27']");
	public static By State=By.xpath("//span[normalize-space()='Alaska']");
	public static By PostalCode=By.xpath("//input[@id='mat-input-15']");
	public static By Phone=By.xpath("//input[@id='mat-input-16']");
	public static By Submit=By.xpath("//span[normalize-space()='Submit']");
	public static By RoleDropdown=By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]/div");
	public static By ShippinyOnly=By.xpath("//span[normalize-space()='Shipping Only']");
	public static By ShippingFinance=By.xpath("//span[normalize-space()='Shipping & Financial Information']");
	public static By Custome=By.xpath("//span[normalize-space()='Custom']");
	public static By Admin=By.xpath("//span[normalize-space()='Full Access (Admin)']");
	public static By LocationCompany=By.xpath("//*[@id=\"mat-input-17\"]");
	public static By LocationSelect=By.xpath("//*[@id=\"ag-1055-input\"]");
	
	public static By Download=By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base']//span[@class='mat-button-wrapper'][normalize-space()='Download']");
	
	public static By EmailError=By.xpath("//mat-error[@id='mat-error-0']");

	// Edit Functionality
	public static By Editbutton=By.xpath("//div[normalize-space()='XPO']");
	public static By UserEdit=By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base ng-star-inserted']//span[@class='mat-button-wrapper'][normalize-space()='Edit']");
	public static By EditEmail=By.xpath("//input[@id='mat-input-7']");
	public static By EditSubmit=By.xpath("//span[normalize-space()='Submit']");
	public static By updateEmail=By.xpath("//body//eso-root//div[@class='eso-UserForm-actions ng-star-inserted']//div//div[@class='ng-star-inserted']//div[2]//i[1]");
	public static By EditFname=By.xpath("//input[@id='firstName']");
	public static By updateFName=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[2]/i[1]");
	public static By EditLname=By.xpath("//input[@id='lastName']");
	public static By updateLName=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[2]/i[1]");
	public static By EditCompany=By.xpath("//input[@id='companyName']");
	public static By updateCompany=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[2]/i[1]");
	public static By EditStreet=By.xpath("//input[@data-placeholder='Street and Number, P.O. box']");
	public static By updateStreet=By.xpath("//b[normalize-space()='Street and Number, P.O. box:']");
	public static By EditCity=By.xpath("//input[@data-placeholder='City Name']");
	public static By EditCountryDropdown=By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]/div");
	public static By EditCountry=By.xpath("//span[@class='mat-option-text'][normalize-space()='United States']");
	public static By UpdateCountry=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[2]/i[1]");
	public static By EditStateDropdown=By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]/div");
	public static By EditState=By.xpath("//span[@class='mat-option-text'][normalize-space()='Alaska']");
	public static By updateState=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[2]/i[1]");
	public static By EditPostal=By.xpath("//input[@data-placeholder='Postal Code']");
	public static By updatePostal=By.xpath("//body/eso-root/xpo-shell[@class='xpo-Shell']/xpo-tab-drawer[@class='xpo-TabDrawer']/mat-drawer-container[@class='mat-drawer-container xpo-TabDrawer-container mat-drawer-transition']/mat-drawer-content[@class='mat-drawer-content xpo-TabDrawer-contentWrapper']/xpo-tab-drawer-content[@class='xpo-TabDrawer-content xpo-Shell-drawerContent']/eso-partner-manager[@class='ng-star-inserted']/eso-users[@class='ng-star-inserted']/xpo-board[@id='users-board']/mat-drawer-container[@class='mat-drawer-container xpo-Board-dataDrawer-container ng-star-inserted mat-drawer-transition']/mat-drawer[@class='mat-drawer xpo-Board-dataDrawer-drawer ng-tns-c42-13 ng-trigger ng-trigger-transform mat-drawer-end mat-drawer-side ng-star-inserted mat-drawer-opened']/div[@class='mat-drawer-inner-container ng-tns-c42-13']/xpo-data-drawer[@class='xpo-DataDrawer ng-tns-c42-13']/div[@class='xpo-DataDrawer-content ng-star-inserted']/eso-user-form/div[@class='eso-UserForm-actions ng-star-inserted']/div[@class='ng-star-inserted']/div[1]");
	public static By EditPhone=By.xpath("//input[@data-placeholder='Phone']");
	public static By updatePhone=By.xpath("//div[9]//i[1]");
	public static By EditRoledropdown=By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]/div");
	public static By EditRole=By.xpath("//*[@id=\"mat-option-60\"]/span");
	public static By updateRole=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer/div/xpo-data-drawer/div[2]/eso-user-form/div[2]/div[1]/div[6]/div[5]/i");
	
	
	public static By Activate=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer/div/xpo-data-drawer/div[2]/eso-user-form/div[1]/app-user-form-actions/xpo-button-group/button[2]/span[1]");
	public static By ActivateConfirm=By.xpath("//*[@id=\"mat-dialog-0\"]/app-set-user-status-dialog/xpo-dialog-actions/div/button[2]/span[1]");
	
	//Set Password
	public static By SetPasswordButton=By.xpath("//span[normalize-space()='Set Password']");
	public static By Password=By.xpath("//*[@id=\"mat-input-7\"]");
	public static By ConfirmPassword=By.xpath("//*[@id=\"mat-input-8\"]");
	public static By Setpassword=By.xpath("//*[@id=\"mat-dialog-0\"]/app-set-password-dialog/xpo-dialog-actions/div/button[2]/span[1]");
	
	
	//Reset Password
	public static By ResetPasswordButton=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer/div/xpo-data-drawer/div[2]/eso-user-form/div[1]/app-user-form-actions/xpo-button-group/button[3]/span[1]");
	public static By ConfirmResetPassword=By.xpath("//*[@id=\"mat-dialog-0\"]/app-send-password-reminder-dialog/xpo-dialog-actions/div/button[2]/span[1]");
	
	public static By DeactivateButton=By.xpath("//*[@id=\"users-board\"]/mat-drawer-container/mat-drawer/div/xpo-data-drawer/div[2]/eso-user-form/div[1]/app-user-form-actions/xpo-button-group/button[2]/span[1]");
	public static By ConfirmDeactivate=By.xpath("//*[@id=\"mat-dialog-1\"]/app-set-user-status-dialog/xpo-dialog-actions/div/button[2]/span[1]");
	
}
