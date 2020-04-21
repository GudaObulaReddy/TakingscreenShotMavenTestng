package TestNgTakingScrenShot.TestNgTakingScrenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base 
{
public static WebDriver driver;

public static void initialization()
{  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
		/*
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 */
}
public void failed(String testMetodName)
{
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(srcfile, new File("C:\\Users\\Ramakrishna\\eclipse-workspace\\TestNgTakingScrenShot\\screenshots\\"+testMetodName+"_"+".jpg"));
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
}
