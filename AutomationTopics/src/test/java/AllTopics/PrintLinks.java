package AllTopics;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PrintLinks  {
   public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		Dimension d=new Dimension(200,600);
//		driver.manage().window().setSize(d);
//		Point p=new Point(100,600);
//		driver.manage().window().setPosition(p);
		driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sandeep");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
      List<WebElement> allLinks=driver.findElements(By.tagName("a"));
      int countLinks=allLinks.size();
      System.out.println("number of links in the webpage are:"+countLinks);
      for(int i=0;i<allLinks.size()-1;i++)
      {
    	  System.out.println(allLinks.get(i).getText());
      }
	}

}
