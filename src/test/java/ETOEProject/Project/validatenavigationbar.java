package ETOEProject.Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landing;
import resourcses.Base;
//adding log
//generating html reports
//screenshot of failure
public class validatenavigationbar extends Base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
	driver=	initializerDriver();
	log.info("Driver is initialized");
	driver.get("https://rahulshettyacademy.com/");
	log.info("navigator to homepage");}
	@Test//(dataProvider="getData")
	public void basePageNavigation() throws IOException, InterruptedException
	{
	
		
		Landing l = new Landing(driver);
		//compare the text from the browser with actual text-error
	//Assert.assertEquals(l.gettitle().getText(), "Learn Earn & Shine");
	//l.gettitle().getText();
//Assert.assertEquals(l.gettitle().getText(), "An Academy to Learn Earn & Shine  in your QA Career");
		//Assert.assertTrue(false);
		Assert.assertTrue(l.getnavigationbar().isDisplayed());
		log.info("validated  navigationbar sucessefully");}
		@AfterTest
		public void Teardown()
		{
			driver.close();
		}
	}




