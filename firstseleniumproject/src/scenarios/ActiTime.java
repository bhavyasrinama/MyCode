package scenarios;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/virtusa/login.do");
		String parentWind = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srilakshmi.padarthi23@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Mahesh@143");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> window=driver.getWindowHandles();
		for(String wn : window)
		{
			if(!wn.equalsIgnoreCase(parentWind))
			{
				driver.switchTo().window(wn);
				System.out.println(driver.getTitle());
			}
			List<WebElement> Headings=driver.findElements(By.xpath("//h2"));
			for(WebElement heading : Headings)
			{
				System.out.println(heading.getText());
			}
		}

		
	}

	}
