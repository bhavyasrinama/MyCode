package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		//set the path of geckdriver.exe
		System.setProperty("webdriver.gecko.driver", 
				".\\driver\\geckodriver.exe");
		
		//launch Firefox browser
		WebDriver driver=new FirefoxDriver();
		
		//enter URl
		driver.get("https://www.seleniumhq.org");
		
		//print title
		String title=driver.getTitle();
		System.out.println(title);
		
		//print Url
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
	}

}
