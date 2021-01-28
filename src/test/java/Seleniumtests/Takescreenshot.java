package Seleniumtests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.screenshot;

public class Takescreenshot {
	
	WebDriver driver;
	
	@Test
	
	public void takescreenshot() throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "//Users//ganesan//Desktop//ganesh//chromedriver");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("ganesan.arumugam2@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("Shruthi29@");
	
	screenshot.getscreenshot(driver, "facebook");
	
	driver.quit();	

}
}
