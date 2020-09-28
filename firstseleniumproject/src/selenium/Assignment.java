package selenium;

import org.openqa.selenium.WebElement;

public class Assignment extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		WebElement active =driver.switchTo().activeElement();
		active.sendKeys("happy teachers day ajit sir ");
	}

}
 