package TestnGTopics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertions {
	@Parameters("browser")
	@Test(priority=0)
	public void softAssert()
	{
		SoftAssert sa=new SoftAssert();
		Reporter.log("soft",true);
		sa.assertTrue(true);
	}
	
	@Test(priority=1)
	public void test1()
	{
       Reporter.log("test1",true);
      // Assert.fail();
	}
	
	@Test(priority=2)
	public void test2()
	{
       Reporter.log("test2",true);
       //Assert.assertTrue(false);
	}
	
	@Test(priority=3)
	public void test3()
	{
       Reporter.log("test3",true);
      // Assert.assertFalse(true);
	}
	
	

}
