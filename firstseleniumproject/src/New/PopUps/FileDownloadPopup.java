package New.PopUps;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {

	static{
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);

		// In chrome, file automatically gets downloaded. so no need to handle.
		//so only n other browsrs need to handle by using BOT class, as popupmis from windows
	}				
		
}
