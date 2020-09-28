package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junitDemo {

	//it is same as testng with few limitations
	// write @test and click on error, and import the junit package
	// before class and after class methods must be static
	// @ignore isused to ignre the test case

	@BeforeClass
	public  static void bc()
	{
		System.out.println("before class");
	}


	@AfterClass
	public  static void ac()
	{
		System.out.println("after class");
	}

	@Test

	public void m()
	{
		System.out.println("hii");
	}

	@Test
@Ignore
	public void n()
	{
		System.out.println("n");
	}
	
	@Test

	public void m2()
	{
		System.out.println("m2");
		Assert.assertEquals("    faied :( ", true, false);
	}
	


	@Before
	public void b()
	{
		System.out.println("before each test");
	}

	@After
	public void a()
	{
		System.out.println("after each test");
	}


}
