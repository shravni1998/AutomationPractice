package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				
				String pageTitle=driver.getTitle();
				System.out.println("Login page title: "+driver.getTitle());
				System.out.println("Page title validation: "+pageTitle.equals("viteger"));
				
				System.out.println("Page url is: "+driver.getCurrentUrl() );
			
				
				String sourceCode=driver.getPageSource();
				//System.out.println("Page source code is: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
				
				WebElement usernameInputField=driver.findElement(By.id("username"));
				usernameInputField.sendKeys("admin");
				
				WebElement passwordInputField=driver.findElement(By.id("password"));
				passwordInputField.sendKeys("Test@123");
				
				
				
				
				WebElement loginBtn=driver.findElement(By.tagName("button"));
				loginBtn.click();
				
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
				
				System.out.println("Home page title: "+driver.getTitle());
				
				
				driver.close();

	}

}
