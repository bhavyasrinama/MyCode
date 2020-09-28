package New.PopUps;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {

	static{
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		Thread.sleep(8000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_4);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_2);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(9000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(9000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
	}

// in chrome browser we can INSPECT THE PRINT BUTTON, SO CAN be handled by using findElement()


}
