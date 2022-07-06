package ETOEProject.Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobjects.Landing;
//import pageobjects.Login;
import resourcses.Base;

public class validateTitle extends Base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
	driver=	initializerDriver();
	driver.get("https://rahulshettyacademy.com/");}
	@Test//(dataProvider="getData")
	public void basePageNavigation() throws IOException, InterruptedException
	{
	
		Landing l = new Landing(driver);
		//compare the text from the browser with actual text-error
	//Assert.assertEquals(l.gettitle().getText(), "Learn Earn & Shine");
	//l.gettitle().getText();
		Assert.assertEquals(l.gettitle().getText(), "An Academy to Learn Earn & Shine  in your QA Career");
		log.info("validated text massage sucessefully");}

		//Assert.assertTrue(false);
		///l.getnavigationbar().getText();
		@AfterTest
		public void Teardown()
		{
			driver.close();}
		
	}



