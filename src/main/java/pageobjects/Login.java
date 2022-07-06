package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

public WebDriver driver;
	
//	ChromeOptions options=new  ChromeOptions();
//	options.addArguments("--disabled-notifications");

	By email=By.id("email");
	 By password = By.id("password");
	 By signin = By.cssSelector("input[type='submit']");
	 By forgotpassword=By.cssSelector("[href*='forgot_password']");
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	public Forgotpassword forgotpassword()
	{
		driver.findElement(forgotpassword).click();
	return new Forgotpassword(driver);
		
	
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	public  WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public  WebElement getsignin()
	{
		return driver.findElement(signin);
	}
}

