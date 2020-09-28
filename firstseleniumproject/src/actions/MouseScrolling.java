package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrolling {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
//		
  ChromeDriver cd = new ChromeDriver();  
  WebDriver driver;
 driver=cd;
 /* ChromeDriver cd1 = new ChromeDriver();
  * WebDriver driver =(WebDriver)cd1;
  */
 
 driver.manage().window().maximize();
 
 driver.get("https://www.bbc.com/news");
 // inspect in UI and in console tab, type window.scrollBy(0,2000) and enter
 JavascriptExecutor j = (JavascriptExecutor) driver;
 j.executeScript("window.scrollBy(0,2000)");
	}

}
