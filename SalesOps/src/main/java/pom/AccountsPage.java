package pom;

import org.openqa.selenium.By;

public class AccountsPage {

	public static By MadCode=By.xpath("//a[normalize-space()='SOHPG001900']");
	public static By CompanyName=By.xpath("//input[@id='mat-input-0']");
	public static By AccountId=By.xpath("//input[@id='mat-input-1']");
	public static By Mad=By.xpath("//input[@id='mat-input-2']");
	public static By City=By.xpath("//input[@id='mat-input-3']");
	public static By Address=By.xpath("//input[@id='mat-input-4']");
	public static By Zip=By.xpath("//input[@id='mat-input-5']");
	public static By StateDropdown=By.xpath("//xpo-filter-chip[@id='myUniqueId-filterBar-filterChip-stateCd']//xpo-icon[@role='img']");
	public static By State=By.xpath("//label[@for='mat-checkbox-912-input']//span[@class='mat-checkbox-label']");
}
