package autoSuggestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the Chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		//Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("FromTag")).sendKeys("Ban");
		Thread.sleep(4000);
		List<WebElement> Alloptions = driver.findElements(By.xpath("//li[contains(@class,'list') and @role='presentation']"));
		int count = Alloptions.size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			String text = Alloptions.get(i).getText();
			System.out.println(text);

		}
		driver.close();
	}
}

