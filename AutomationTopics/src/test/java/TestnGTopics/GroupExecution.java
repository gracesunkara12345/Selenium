package TestnGTopics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(priority=0,groups="smoke")
	public void smoke()
	{
		Reporter.log("smoke",true);
	}
	
	@Test(priority=1,groups="sanity")
	public void sanity()
	{
		Reporter.log("sanity",true);
	}
	
	@Test(priority=2,groups="smoke")
	public void smoke1()
	{
		Reporter.log("smoke1",true);
	}
	

}
