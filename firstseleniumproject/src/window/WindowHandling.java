package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {									
		WebDriver driver=new ChromeDriver();			

		//Launching the site.				
		driver.get("http://demo.guru99.com/popup.php");			
		driver.manage().window().maximize();		

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			

		String MainWindow=driver.getWindowHandle();		 

		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();
		int noOfWindows= s1.size();
		System.out.println(noOfWindows);
		/*  Iterator<String> i1=s1.iterator();		

	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();	*/


		for(String windowname : s1)
		{
			driver.switchTo().window(windowname);
			System.out.println(windowname);
			System.out.println(driver.getTitle());
			//closing all windows except main window
			if(!MainWindow.equals(windowname))
			{
				driver.close();
			}
			/*to close all drivers in reverse order

	            	for(int i=noOfWindows;i>1;i--)
	            	{
	            		driver.close();
	            	}
			 */

		}




	}
}