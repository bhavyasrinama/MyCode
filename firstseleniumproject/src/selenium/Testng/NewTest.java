package selenium.Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  
@BeforeClass
public void openApp() {
Reporter.log("openApp",true);
}
@AfterClass
public void closeApp() {
Reporter.log("close App",true);
}
@BeforeTest
public void login() {
Reporter.log("login",true);
}
@AfterMethod
public void logout() {
Reporter.log(" logout",true);
}
@Test(priority=2,invocationCount=2)
public void editCustomer() {
Reporter.log("edit custumer",true);
}
@Test
public void registerCustomer() {
Reporter.log("register custumer",true);
}
@Test
public void deleteCustomer() {
Reporter.log("delete customer",true);
}
@Test
public void aeleteCustomer0() {
Reporter.log("delete1 customer",true);
}

}
