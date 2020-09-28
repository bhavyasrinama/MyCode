package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.softwaretestinghelp.com/handling-iframes-using-selenium/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = frames.size();
		System.out.println(noOfFrames);

		for(WebElement frame:frames)
		{
			//driver.manage();
			System.out.println("frame id is :"+frame.getAttribute("id"));
			System.out.println("frame name is :"+frame.getAttribute("name"));
		}






	}

}
