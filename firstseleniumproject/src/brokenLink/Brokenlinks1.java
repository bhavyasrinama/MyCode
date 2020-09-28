package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks1 {

	public static void main(String[] args) throws IOException {
		  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver(); 
		String homepage="http://www.zlti.com";
		String url="";
		int respcode = 200;
		HttpURLConnection huc = null;
		driver.get(homepage);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
		List<WebElement> links =driver.findElements(By.linkText("a"));
		Iterator<WebElement> it= links.iterator();
		while(it.hasNext())
		{
			url= it.next().getAttribute("href");
			System.out.println(url);
			if(url==null||url.isEmpty())
			{
				System.out.println("link is not configured to anchor tag or empty");
				continue;
			}
			if(!url.startsWith(homepage))
			{
				System.out.println("belons to external link");
				continue;
			}

			try{
				huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod(url);
				huc.connect();
				respcode=huc.getResponseCode();
				if(respcode>=400)
				{
					System.out.println( url+" is broken link");

				}
				else
				{
					System.out.println(url+" is valid link");
				}
			}
			catch(MalformedURLException e){e.printStackTrace();}
			driver.quit();
		}
	}
}

