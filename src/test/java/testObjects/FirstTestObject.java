package testObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstTestObject {

	private WebDriver driver;

	public FirstTestObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[text()='Email address']//following::input[1]")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//div[@class='error-copy']/h3")
	WebElement text;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn;
	
	public void enterUsernamePassword(String user , String pass) {
		driver.manage().window().maximize();
		String baseUrl = "http://demo.guru99.com/test/login.html";					
	    driver.navigate().to(baseUrl);
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void verifyLoggedIn() {
		signIn.click();
		String t =text.getText();
		if(t.equalsIgnoreCase("Successfully Logged in...")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

}
