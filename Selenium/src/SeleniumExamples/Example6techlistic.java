package SeleniumExamples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6techlistic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.className("overflowable-item")).click();
		
		
		
	
		driver.findElement(By.partialLinkText("python")).click();

		
		String pageTitle=driver.getTitle();
		System.out.println("home page title: "+driver.getTitle());
		System.out.println("Page title validation: "+pageTitle.equals("https://www.techlistic.com/p/java.html"));
	     driver.navigate().back();
	     
	     
	}

}
