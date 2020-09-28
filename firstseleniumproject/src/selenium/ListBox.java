package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox extends BaseClass {
	public static void main(String[] args) {
		
	
	driver.get("file:///C:/Users/BHAVYA/Desktop/ListBox_Breakfast.html");
	WebElement ListBox=driver.findElement(By.id("mtr"));
	//create an object of select class and pass address of listbox as a argument
	Select s= new Select(ListBox);
	List<WebElement> options= s.getOptions();
	int size=options.size();
	System.out.println(size);
	//print all the elements present in the list box
	for(WebElement WebElement:options){
		String text=WebElement.getText();
		System.out.println(text);
		}			
	}
}
