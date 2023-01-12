package SeleniumExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		
		driver.manage().window().maximize();
		
		String pageTitle=driver.getTitle();
		System.out.println("Login page title: "+driver.getTitle());
		System.out.println("Page title validation: "+pageTitle.equals("Live cricket scores, match schedules, latest cricket news, cricket videos"));
		
        List<WebElement> menu=driver.findElements(By.cssSelector(".ds-bg-fill-navbar>div>div>div>div>div>a"));
		
        System.out.println("Menu count is:"+menu.size());
		
		for (int i = 0; i < menu.size(); i++) {
			
			WebElement List=menu.get(i);
			System.out.println(List.getText());
		}
	   driver.close();
		
	}

}
