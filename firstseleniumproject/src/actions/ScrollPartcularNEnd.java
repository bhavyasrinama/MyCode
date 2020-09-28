package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPartcularNEnd {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/news");
		WebElement e = driver.findElement(By.xpath("//h3[.='India CO2 emissions fall for first time in decades']"));
		int y = e.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	jse.executeScript("window.scrollTo(0,0)");
		
	}

}
