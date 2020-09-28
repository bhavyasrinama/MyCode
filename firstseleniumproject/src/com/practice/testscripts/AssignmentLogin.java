package com.practice.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practice.generics.CommonData;
import com.practice.generics.WebDriverCommonLib;

public class AssignmentLogin {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				WebDriverCommonLib wc = new WebDriverCommonLib();
				CommonData cd = new CommonData();
				wc.waitForPageToLoad(driver);
				driver.get(cd.getProprtyData("url"));
				driver.findElement(By.id("username")).sendKeys(cd.getProprtyData("username"));
				driver.findElement(By.name("pwd")).sendKeys(cd.getProprtyData("password"));
				driver.findElement(By.xpath("//div[.='Login ']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[.='New']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[.='- Select Customer -']")).click();
				driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
				String customerName= cd.getExcelData("./data/commondata.property", "Sheet1", 1, 0);
				String projectName= cd.getExcelData("./data/commondata.property", "Sheet1", 1, 1);

				driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys(customerName);
				driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys(projectName);
				
				
				String taskName = cd.getExcelData("./data/commondata.property", "Sheet1", 1, 2);
				driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys(taskName);
				driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
				Thread.sleep(15000);
				driver.findElement(By.xpath("//span[.='Project']")).click();
				Thread.sleep(5000);
				WebElement newTask = driver.findElement(By.xpath("//tbody[@id='actualTTRows']//span[.='88546546']"));
				Thread.sleep(5000);

				if(newTask.isDisplayed())
				{
				cd.setExcelData("./data/commondata.property", "Sheet1", 1, 2,"pass");
				}
				else
				{
					cd.setExcelData("./data/commondata.property", "Sheet1", 1, 2,"fail");
				}

				System.out.println(cd.getExcelData("./data/commondata.property", "Sheet1", 1,6));
				driver.findElement(By.linkText("Logout")).click();
				driver.close();
				}			
	}
