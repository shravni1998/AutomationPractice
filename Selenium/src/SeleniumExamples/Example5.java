package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Example5 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				
				//maximize
				driver.manage().window().maximize();
				
				String pageTitle=driver.getTitle();
				System.out.println("home page title: "+driver.getTitle());
				System.out.println("Page title validation: "+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
				
				System.out.println("Page url is: "+driver.getCurrentUrl() );
				
				
				String sourceCode=driver.getPageSource();
				//System.out.println("Page source code is: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
				
				//fashion menu
				driver.findElement(By.linkText("Fashion")).click();
				
				//page title and print it
				System.out.println("Fashion page title: "+driver.getTitle());
				
				driver.navigate().back();
				
				//get page title validate with home page Title
				
				System.out.println("home page title: "+driver.getTitle());
				System.out.println("Page title validation: "+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
							
				driver.close();

	}

}

