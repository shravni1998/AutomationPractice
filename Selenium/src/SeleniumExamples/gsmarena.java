package SeleniumExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
        driver.manage().window().maximize();
		
		String pageTitle=driver.getTitle();
		System.out.println("Login page title: "+driver.getTitle());
		System.out.println("Page title validation: "+pageTitle.equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		
		 List<WebElement> menu=driver.findElements(By.cssSelector("ul>li>a"));
			
	        System.out.println("Menu count is:"+menu.size());
			
			for (int i = 0; i < menu.size(); i++) {
				
				WebElement List=menu.get(i);
				System.out.println(List.getText());
			}
			// menu.get(0).click();
			
			 driver.findElement(By.linkText("Samsung"));
			 List<WebElement> list=driver.findElements(By.cssSelector("#review-body>div>ul>li>a"));
				
		        System.out.println("Samsung phones count is:"+list.size());
				
				for (int i = 0; i < list.size(); i++) {
					
					WebElement List=list.get(i);
					System.out.println(List.getText());
				}
			
			
		   driver.close();
	}

}
