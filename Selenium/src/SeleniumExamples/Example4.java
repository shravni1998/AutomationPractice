package SeleniumExamples;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Example4 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("http://sampleapp.tricentis.com/101/");
				
				String pageTitle=driver.getTitle();
				System.out.println("Login page title: "+driver.getTitle());
				System.out.println("Page title validation: "+pageTitle.equals("Tricentis Vehicle Insurance"));
				
				System.out.println("Page url is: "+driver.getCurrentUrl() );
				
				String sourceCode=driver.getPageSource();
				//System.out.println("Page source code is: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
							
				driver.close();

	}

}

