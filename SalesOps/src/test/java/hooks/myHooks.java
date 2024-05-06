package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Date;
import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myHooks extends DriverFactory {
	public static WebDriver driver;
	public DriverFactory driverfactory;
	
	@Before
	public void setup() throws IOException {
	       
	        driver = DriverFactory.initializeBrowser("chrome", "local");
	     
	    }
	
	@After
	public void tearDown()
	{
		
		driver.close();
		
	}   
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException, InterruptedException
	{        
		    Thread.sleep(1000);
			String scenarioName=	scenario.getName().replace(" ", "_");
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenarioName + new Date() );
		//screenshot
	/*	File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");  */
		
		
	}
}