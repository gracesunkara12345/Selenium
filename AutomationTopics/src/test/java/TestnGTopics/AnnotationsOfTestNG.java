package TestnGTopics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsOfTestNG {
	
	@BeforeSuite
	public void bs()
	{
		Reporter.log("launch", true);
	}
	
	@BeforeTest
	public void bt()
	{
		Reporter.log("select browser", true);
	}
	
	@BeforeClass
	public void bc()
	{
		Reporter.log("open url", true);
	}
	
	@BeforeMethod
	public void bm()
	{
		Reporter.log("before start the step", true);
	}
	
	@Test
	public void test1()
	{
		Reporter.log("test1", true);
	}
	
	
	@Test
	public void test2()
	{
		Reporter.log("test2", true);
	}
	
	@AfterMethod
	public void am()
	{
		Reporter.log("after step", true);
	}
	
	@AfterClass
	public void ac()
	{
		Reporter.log("ac", true);
	}
	
	@AfterTest
	public void at()
	{
		Reporter.log("at", true);
	}
	
	@AfterSuite
	public void as()
	{
		Reporter.log("as", true);
	}

}
