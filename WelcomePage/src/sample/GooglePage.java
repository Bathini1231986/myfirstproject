package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GooglePage {
	
	public WebDriver driver;
	
	
	@Test
	public void setup()
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anitha\\Desktop\\testproject\\WelcomePage\\projectjars\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void Logout()
	{
		driver.findElement(By.id("logout")).click();
	}
	
}
