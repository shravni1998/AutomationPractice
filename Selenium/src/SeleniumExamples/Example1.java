package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				String pageTitle=driver.getTitle();
				System.out.println("Login page title: "+driver.getTitle());
				System.out.println("Page title validation: "+pageTitle.equals("OrangeHRM"));
				
				//String pageUrl=driver.getTitle();
				System.out.println("Page url is: "+driver.getCurrentUrl() );
				//System.out.println("Page url is: "+pageUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") );
			
				
				String sourceCode=driver.getPageSource();
				//System.out.println("Page source code is: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
				
				WebElement usernameInputField=driver.findElement(By.name("username"));
				usernameInputField.sendKeys("Admin");
				
				WebElement passwordInputField=driver.findElement(By.name("password"));
				passwordInputField.sendKeys("admin123");
				
				
				
				
				WebElement loginBtn=driver.findElement(By.tagName("button"));
				loginBtn.click();
				
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
				
				System.out.println("Home page title: "+driver.getTitle());
				
				
				driver.close();

	}

}
