package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static {

		//System.setProperty("webdriver.gecko.driver", 
		//		".\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	//public static	WebDriver driver=new FirefoxDriver();
	public static WebDriver driver=new ChromeDriver();


}


