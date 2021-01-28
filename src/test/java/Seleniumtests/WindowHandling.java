package Seleniumtests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	String baseurl="http://demo.guru99.com/popup.php";
	
	System.setProperty("webdriver.chrome.driver", "/Users/ganesan/Desktop/ganesh/chromedriver");
		
	WebDriver driver =new ChromeDriver();
	
	driver.get(baseurl);
	
	driver.findElement(By.xpath("//a[contains (@href,'popup.php')]")).click();
		
	String mainwindow= driver.getWindowHandle();
	
	Set <String> s1= driver.getWindowHandles();
	Iterator<String> i1 = s1.iterator();
	
	while (i1.hasNext())
	{
		String childwindow=i1.next();
		
		if(!mainwindow.equalsIgnoreCase(childwindow))
		{
			driver.switchTo().window(childwindow);
			
			driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			driver.close();
			
		}
		
	}
		
	driver.switchTo().window(mainwindow);
	driver.quit();
	
	}

}
