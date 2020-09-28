package calender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderListType {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByValue("31");
		
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Oct");

		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByIndex(9);


	}

}

