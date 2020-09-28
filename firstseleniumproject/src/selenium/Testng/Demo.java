package selenium.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=1,invocationCount=2,enabled=true)
	public void create()
	{
		System.out.println("console");
		Reporter.log("create");
	}
	@Test(priority=2)
	public static void edit()
	{
		Reporter.log("edit", true);
	}
	@Test(priority=1)
	public static void delete()
	{
		Reporter.log("delete",false);
	}

}
