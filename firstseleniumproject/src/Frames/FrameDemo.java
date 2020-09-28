package Frames;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameDemo {
static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.softwaretestinghelp.com/");
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = frames.size();
		System.out.println("no of frames "+noOfFrames);
		for(WebElement frame: frames)
		{
			driver.switchTo().frame(frame);
			//System.out.println("frame id is :"+frame.getAttribute("id"));
			//System.out.println("frame id is :"+frame.getAttribute("name"));
		}






	}

}
