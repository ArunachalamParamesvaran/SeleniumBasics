package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demosetup {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
		// ---added dependencies to mange the webdriver 
		
//		(To launch chrome)
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
//		(To launch Firefox)
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver = new FirefoxDriver();
		
//		(To launch Edge)
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();

	}


}
