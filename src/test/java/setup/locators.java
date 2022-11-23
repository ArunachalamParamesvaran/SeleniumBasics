package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
//selenium java doc website for more details (selenium.dev/selenium/docs/api/java/)
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
		
//		driver.get("https://saucedemo.com/");
////		driver.findElement(By.id("user-name")).sendKeys("standard_user");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("standard_user");
////		driver.findElement(By.className("input_error form_input")).sendKeys("standard_user");  						( not working need to check )
////		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		//*[@id="user-name"]
//		
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//		
////		driver.findElement(By.id("password")).sendKeys("secret_sauce");
////		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(1000);
//		driver.close();
		
		
//		Facebook link text forget user id 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("standard_user");
		driver.findElement(By.id("pass")).sendKeys("standard_user");
		driver.findElement(By.linkText("Forgotten password?")).click(); // link text example , a link in a website and the visible text of it get clicked 
		driver.findElement(By.partialLinkText("Forgotten")).click(); //		partial link text Facebook link text forget account from forget password page


	Thread.sleep(1000);
	driver.close();

	}

}
