package SeleniumExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotVitiger {

	public static void main(String[] args) throws IOException{
		SeleniumUtilities m1=new SeleniumUtilities();	
		WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		//type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file=ts.getScreenshotAs(OutputType.FILE);
		//store above screenshot into required location
		FileUtils.copyFile(file,new File(".\\screenshots\\vtiger.jpg"));

	}

}
