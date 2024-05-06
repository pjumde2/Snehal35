package driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverFactory {
	
	public static WebDriver driver;
	
	
	
	public static WebDriver initializeBrowser(String browserName, String location) throws IOException {
       
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser_Name = prop.getProperty("browser");
		       
        if (browser_Name.equalsIgnoreCase("Edge") && location.equalsIgnoreCase("local")) {
        	System.setProperty("webdriver.edge.driver",
   		         "C:\\Users\\pjumde\\Desktop\\Cucumber\\SalesOps\\src\\test\\resources\\msedgedriver.exe");
   		  driver = new EdgeDriver();
   		
                   
        }

        return driver;
}
	
	
}
