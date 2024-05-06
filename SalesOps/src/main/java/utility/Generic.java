package utility;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generic {

	//builds a new report using the html template
		public static ExtentHtmlReporter htmlReporter;
		public   static ExtentReports extent;
		public   static ExtentTest test;//helps to generate the logs in test report.
		    public String ScreenShotPath;
		    
		    private WebDriverWait wait;
		    
		    public static void startTest()
		    {
		    	//initialize ExtentReports and attach the HtmlReporter
		    	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
		    	 extent = new ExtentReports();
		    	 extent.attachReporter(htmlReporter);
		    		    	
		    	
		    	
		         //configuration items to change the look and feel
		         //add content, manage tests etc
		         htmlReporter.config().setDocumentTitle("Extent Report Demo");
		         htmlReporter.config().setReportName("Test Report");
		         htmlReporter.config().setTheme(Theme.STANDARD);
		         htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	
}
}
