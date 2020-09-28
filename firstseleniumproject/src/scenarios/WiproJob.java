package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WiproJob {


	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	@Test
	public void captureURL(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
