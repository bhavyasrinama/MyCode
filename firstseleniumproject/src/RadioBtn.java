import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
	//in html attribute as type ="radio", indicaes WE as radio button
	   public static void main(String[] args) {  
	          
	        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	        driver.get("file:///J:/RadioButton.html");  
	       // driver.findElement(By.xpath("//input[@value='Banana']")).click();  
	        int a = driver.findElements(By.xpath("//input [@name='group1']")).size();  
	        System.out.println(a);  
	       for(int i=1;i<=a;i++)  
	       {  
	            WebElement btn=driver.findElement(By.xpath("//input[@value='Banana']")); 
	            btn.click();
	        } 
	       //driver.close();
	        }  
	  
	  

}
