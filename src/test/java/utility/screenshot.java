package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

public  static void getscreenshot(WebDriver driver,String screenshotname) throws IOException {
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	
    File src = ts.getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src,new File("./Screeenshot/"+screenshotname+".png"));
	
    System.out.println("Screenshot is taken");   
	
}


}


