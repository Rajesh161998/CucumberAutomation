package teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import testExecutions.Hooks;
import testObjects.FirstTestObject;

public class FirstStepDefinition {
	private WebDriver driver;
	private FirstTestObject firstObject;
	
//	public FirstStepDefinition() {
//		
//	}

	public FirstStepDefinition() {
		this.driver=Hooks.driver;
		firstObject = new FirstTestObject(driver);
	}
	
	@Given("I login to a website with email {string}")
	public void i_login_to_a_website_with_email(String email) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\chromedriver_win32\\chromedriver.exe");					
//         driver = new ChromeDriver();
        
//        driver.manage().window().maximize();
//        
//        String baseUrl = "http://demo.guru99.com/test/login.html";					
//        driver.navigate().to(baseUrl);
//        
//        WebElement user = driver.findElement(By.id("email"));							
//
//        // Get the WebElement corresponding to the Password Field		
//        WebElement password = driver.findElement(By.name("passwd"));							
//
//        user.sendKeys(email);					
//        password.sendKeys("abcdefghlkjl");
	//	Hooks.setUpDriver();
		firstObject.enterUsernamePassword(email, "abcdefghlkjl");
        
	}

	@Then("the user in logged in")
	public void the_user_in_logged_in() {
//	    WebElement text = driver.findElement(By.xpath("//div[@class='error-copy']/h3"));
		firstObject.verifyLoggedIn();
	}

}
