package listerns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerns.ListernsTest.class)//packagename.classname

public class ListernsDemo1 {
	
	WebDriver driver;
	@BeforeTest
	public void base()
	{

	 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	  driver= new ChromeDriver();}
	@Test
	public void loginPass(){
		
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();
		
	}
	
	@Test
	public void TestFail()
	{
		System.out.println("test failed");
		Assert.assertTrue(false);
	}
	@AfterTest
	public void last(){
		driver.close();}
	}
