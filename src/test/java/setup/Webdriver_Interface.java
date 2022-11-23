package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Interface {
//	Initialize Interface
	public static WebDriver driver;
//	To define the browser 
	public static String browser = "edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();			
		}
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();			
		}

//		Actual common code for all browser 
		
		driver.get("https://saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");	
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

//To manage multiple browser we use interface as we cant create obj for an interface but chrome driver is a class 
//that why we were able to use ChromeDriver driver = new ChromeDriver(); but not WebDriver = new chromeDriver();
//if we use like if else it will not take so we are trying to use a common interface 
