package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prog2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Robot r = new Robot();

		driver.get("https://www.facebook.com");
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println("current titleeeeee" + title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesource = driver.getPageSource();
		System.out.println("current page" + pagesource);
		driver.navigate().forward();

		driver.navigate().refresh();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);

		driver.close();

	}

}
