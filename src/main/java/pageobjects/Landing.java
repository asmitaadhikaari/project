package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import bsh.This;

public class Landing  {
public  WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//div/h2");
	By navigationbar=By.cssSelector("ul[class='navigation clearfix']");

	//col-md-6 text-left
	public Landing(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

	public Login getlogin()
	{
		 driver.findElement(signin).click();
		Login lo=new Login(driver);
		return lo;
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}

public WebElement getnavigationbar()
{
	return driver.findElement(navigationbar);
}
}
