package navigatio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navMethod {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("https://www.google.com/");
		// driver.navigate().to("");
		nav.back();
		nav.forward();
		nav.refresh();
		driver.close();
	}
}
