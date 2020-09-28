import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelRadioBtn {
	public static void main(String[] args) { 
		int i;

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();  
		driver.get("file:///J:/RadioButton.html");  
       List<WebElement> options= driver.findElements(By.name("group1"));
       System.out.println("no. of ratio options is " + options.size());
       for(i=0;i<options.size();i++)
    	// In list storage of elements starts from index 0 same as array   
       {
    	   System.out.println("radio btn text = "+options.get(i).getAttribute("value"));
       }
	}  

}
