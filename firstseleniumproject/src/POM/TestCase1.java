package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	//	String value=".\\driver\\chromedriver.exe";
	WebDriver driver;

	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	/**

	 * This test go to http://demo.guru99.com/V4/

	 * Verify login page title as guru99 bank

	 * Login to application

	 * Verify the home page using Dashboard message

	 */


	@Test(priority=1)
	public void Login(){
		//create login page object
		LoginPage objLogin= new LoginPage(driver);
		//verify login page title
		String loginPageTitle= objLogin.getTitle();;
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99"));
		//Login to application
		objLogin.logInPage("mngr252491", "erUqYte");
		//create homepage obj
		HomePage homepageObj = new HomePage(driver);
		String homePageUser=homepageObj.getUserName();
		//verify homepage title
		Assert.assertTrue(homePageUser.toLowerCase().contains("mngr252491"));
	}
	@AfterTest
	public void end()
	{
		driver.close();
	}

}
