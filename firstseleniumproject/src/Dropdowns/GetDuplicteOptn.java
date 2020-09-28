package Dropdowns;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDuplicteOptn {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///H:/ht2.html");
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='mlq']"));
		Select s1 = new Select(dropdown);
		if(s1.isMultiple()){
			System.out.println("It is a mutiple selection drop down");
		}
		List<WebElement> alloptns = s1.getOptions();
		// as set dosent store/add duplicate elements, using it. add() returntype is boolean. so if it fails to add, it means t is duplicate
		HashSet<String> optns = new HashSet<String>();
		int count = alloptns.size();
		for(int i=0;i<count;i++)
		{
			WebElement listoptn = alloptns.get(i);//***********
			String actualText = listoptn.getText();//**********
			System.out.println("Duplicate options are:");
			if(optns.add(actualText)==false)
			{
				System.out.println(actualText);
			}
			
			}
		}
		
		
	}


