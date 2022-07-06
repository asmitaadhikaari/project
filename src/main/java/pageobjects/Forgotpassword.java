package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {

public WebDriver driver;
	
//	ChromeOptions options=new  ChromeOptions();
//	options.addArguments("--disabled-notifications");

	By email=By.id("email");
	 By sendmeinstruction= By.cssSelector("[type='submit']");
	
	
	public Forgotpassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
		
		
	}
	public WebElement sendmeinstruction()
	{
		return driver.findElement(sendmeinstruction);
	}
		
}