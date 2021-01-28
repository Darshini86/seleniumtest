package Seleniumtests;

import java.util.List;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	

public class Sampleprogram {
	
	
	public static void main(String[] args) {
		
		
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","/Users/ganesan/Desktop/ganesh/chromedriver");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);	
        
        List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
        
        System.out.println("the total number of links on the page is"+ TotalLinks.size());
        
       for (int i=0;i <=TotalLinks.size();i++)
    	   
       {
    	   System.out.println(TotalLinks.get(i).getText());
       }
        
//        String theLinkText = driver.findElement(By					
//                .partialLinkText("egis"))			
//                .getText();		
//        System.out.println(theLinkText);					
//        theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();		
//        System.out.println(theLinkText);					

        driver.quit();			

    }

}
