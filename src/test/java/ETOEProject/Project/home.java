package ETOEProject.Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Forgotpassword;
import pageobjects.Landing;
import pageobjects.Login;
import resourcses.Base;

public class home extends Base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
	driver=	initializerDriver();
	driver.get("https://rahulshettyacademy.com/");}
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException, InterruptedException
	{
		driver=	initializerDriver();
		driver.get("https://rahulshettyacademy.com/");
		Landing l = new Landing(driver);
		
		Login lo=l.getlogin();
		lo.getemail().sendKeys(Username);
		lo.getpassword().sendKeys(Password);
		//System.out.println(text);
		log.info(text);
		System.out.println("text");
		lo.getsignin().click();
		Forgotpassword fb=lo.forgotpassword();
		fb.getemail().sendKeys("ssss");
		fb.sendmeinstruction().click();
	}
		@DataProvider
		public Object[][]  getData() {//rows stand for how many different data type test should run
			//colunm stands for how many values for per test
			//ARRAY size 5 means 0,1,2,3,4
			Object[][] data=new	Object[2][3];
			data[0][0]="nonrestrictedusername";
			data[0][1]="12345";
			data[0][2]="restricted user";
			data[1][0]="nonrestrictedusername";
			data[1][1]="123453";
			data[1][2]="Non restricted user";
			
			return data;
	}
		@AfterTest
		public void Teardown()
		{
			driver.close();
		
	}

}