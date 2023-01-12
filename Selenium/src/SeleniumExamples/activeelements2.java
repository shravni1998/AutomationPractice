package SeleniumExamples;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activeelements2 {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		System.out.println("is mouse pointer present in Username input field? "+str.equals("First Name"));
		username.sendKeys("Shravni",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Gurav",Keys.ENTER);
		
	}

}
