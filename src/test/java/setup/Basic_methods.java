package setup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_methods {
	public static WebDriver driver;
	public static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
//		seleniumdev doc for more details
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_item']")); // entire list
																										// of items
																										// findelements(s)
		System.out.println(webelements);
		String windowhandle = driver.getWindowHandle(); // gives the window details CDwindow-BB5BD258534686AF725F37B4D1B0A832
		System.out.println(windowhandle); 
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB); // new code to open new tab
		driver.navigate().to("https://google.com/");
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles); // gives all the windows details CDwindow-BB5BD258534686AF725F37B4D1B0A832
		Thread.sleep(1000);
//		driver.navigate().to("https://google.com/"); // navigate(). many option back front etc..

		driver.switchTo().newWindow(WindowType.WINDOW); // new code to open new window
		Thread.sleep(1000);
		driver.navigate().to("https://google.com/");
		driver.close(); // close only the current window
//		driver.quit(); //quit close everything

		Thread.sleep(1000);

	}

}
