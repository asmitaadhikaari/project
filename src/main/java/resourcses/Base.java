package resourcses;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
public  WebDriver initializerDriver() throws IOException, InterruptedException
{
	Properties prop=new Properties();
	FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\Project\\src\\main\\java\\resourcses\\data.property");
prop.load(fis);
//String browserN=prop.getProperty("browser");
String browserN=System.getProperty("browser");
if(browserN.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	
	
	
	driver = new ChromeDriver();//options
	
	driver.get("https://rahulshettyacademy.com/");
	
}
else if(browserN.equals("firefox"))
{
	driver=new FirefoxDriver();
}
else if(browserN.equals("IE"))
{
}
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
return driver;

}
public  String  getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
	
}

}
	

