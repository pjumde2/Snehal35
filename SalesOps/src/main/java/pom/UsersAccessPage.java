package pom;

import org.openqa.selenium.By;

public class UsersAccessPage {
	
	public static By Edit=By.xpath("//button[@type='button']//span[@class='mat-button-wrapper'][normalize-space()='Edit']");
	public static By Company=By.xpath("//input[@id='mat-input-7']");
	public static By CompanyRecord=By.xpath("//*[@id=\"myUniqueId\"]/xpo-ag-grid-board/xpo-ag-grid/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[6]/div[4]");
	public static By AccountId=By.xpath("//input[@id='mat-input-8']");
	public static By Mad=By.xpath("//input[@id='mat-input-9']");
	public static By MadRecord=By.xpath("//*[@id=\"cell-1296\"]/span/span[4]/app-account-group-cell-renderer/a");
	public static By City=By.xpath("//input[@data-placeholder='City']");
	public static By CityRecord=By.xpath("//app-account-access-grid[@data-cy='accountAccess-grid']//div[@name='center']//div[@role='rowgroup']//div[1]//div[6]");
	public static By Address=By.xpath("//input[@data-placeholder='Address']");
	public static By AddressRecord=By.xpath("//app-account-access-grid[@data-cy='accountAccess-grid']//div[@name='center']//div[@role='rowgroup']//div[1]//div[6]");
	public static By zip=By.xpath("//input[@data-placeholder='Zip']");
	public static By ZipRecord=By.xpath("//app-account-access-grid[@data-cy='accountAccess-grid']//div[@name='center']//div[@role='rowgroup']//div[1]//div[6]");
	
	public static By location=By.xpath("//*[@id=\"ag-1329-input\"]");
	public static By AddLocation=By.xpath("//*[@id=\"mat-dialog-0\"]/eso-user-form-grid-edit-dialog/xpo-dialog-content/div/eso-account-access-pick-list/div[2]/button[1]/span[1]");
	public static By Relocations=By.xpath("//*[@id=\"ag-1658-input\"]");
	public static By RemoveLocation=By.xpath("//*[@id=\"mat-dialog-1\"]/eso-user-form-grid-edit-dialog/xpo-dialog-content/div/eso-account-access-pick-list/div[2]/button[2]/span[1]");
	public static By Save=By.xpath("//*[@id=\"mat-dialog-0\"]/eso-user-form-grid-edit-dialog/xpo-dialog-actions/div/button[2]/span[1]");
	public static By SaveSubmit=By.xpath("//*[@id=\"mat-dialog-1\"]/eso-user-form-grid-edit-dialog/xpo-dialog-actions/div/button[3]");
	
	
	public static By Reset=By.xpath("//button[@class='mat-focus-indicator eso-gridEdit-actions-resetBtn mat-stroked-button mat-button-base']//span[@class='mat-button-wrapper']");
	public static By DuplicateCompany=By.xpath("//*[@id=\"mat-input-13\"]");
	
}
