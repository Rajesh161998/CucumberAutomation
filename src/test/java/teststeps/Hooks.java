package teststeps;

import org.openqa.selenium.WebDriver;
import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.*;

public class Hooks {
	
	public static WebDriver driver;

	public Hooks() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public static  void setUpDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\chromedriver_win32\\chromedriver.exe");					
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}
	
	@AfterAll
	public static void createReport() {
		ExtentReports extent = new ExtentReports();
	}

}
