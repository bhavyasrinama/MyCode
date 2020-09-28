package testngprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	
	public void test1()
	{
		// sop prints on console but not on reports
		System.out.println("hiii");
		//false or noting is same, it dosent print on console
		Reporter.log("welcome beautiful",false);
		// true, it prints on both console and reports
		Reporter.log("Good to see u",true);

	}

	public static void main(String[] args){
		System.out.println("hiiiiiiiiiiiiiii");
	}
}
