package Seleniumtests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseurl="http://demo.guru99.com/test/delete_customer.php";
		
		System.setProperty("webdriver.chrome.driver", "/Users/ganesan/Desktop/ganesh/chromedriver");
			
		WebDriver driver =new ChromeDriver();
		
		driver.get(baseurl);
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alert =driver.switchTo().alert();
		
		String Alerttext=alert.getText();
		
		System.out.println("The Alert message is " + Alerttext);
		
		Thread.sleep(3000);
		
		alert.accept();
			
		
	}	
		
	}
