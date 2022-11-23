package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_locator {
//selenium java doc website for more details (selenium.dev/selenium/docs/api/java/)
//	Initialize Interface
	public static WebDriver driver;
//	To define the browser 
	public static String browser = "edge";
	
//Relative locator is like finding webelement(when it dosnt have unique attribute
//	by using the reference of other webelement  	
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();			
		}
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();			
		}
		
		driver.get("https://saucedemo.com/");
//		---------------Doubt DOUBT ------------
		By username = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
//		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.close();
		
		


	}

}
