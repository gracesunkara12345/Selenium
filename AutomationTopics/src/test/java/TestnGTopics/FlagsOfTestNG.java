package TestnGTopics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOfTestNG {
	
	@Test(priority=0)
	public void test1()
	{
		Reporter.log("test1",true);
	}
	
	
	@Test(priority=1,enabled=false)
	public void test2()
	{
		Reporter.log("test2", true);
	}
	
	@Test(priority=2,invocationCount = 5)
	public void test3()
	{
		Reporter.log("test3", true);
	}
	
	@Test(priority=3,dependsOnMethods= {"test1","test3"})
	public void test4()
	{
		Reporter.log("test4", true);
	}
	
	
	
	

}
