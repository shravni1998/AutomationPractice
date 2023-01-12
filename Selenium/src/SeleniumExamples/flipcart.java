package SeleniumExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("_2doB4z")).click();
		
		String pageTitle=driver.getTitle();
		System.out.println("Login page title: "+driver.getTitle());
		System.out.println("Page title validation: "+pageTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		
		String url=driver.getCurrentUrl();
		System.out.println("validation of url="+url.equals("https://www.flipkart.com/"));
		 
		List<WebElement> menu=driver.findElements(By.cssSelector("._37M3Pb>div>a>div>div>img"));
		
		System.out.println("Menu count is:"+menu.size());
		
		for (int i = 0; i < menu.size(); i++) {
			
			WebElement List=menu.get(i);
			System.out.println(List.getText());
		}
		
	   driver.close();
		
		
	}

}
