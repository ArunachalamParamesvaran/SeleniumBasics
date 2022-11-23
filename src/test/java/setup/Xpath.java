package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static WebDriver driver;
	public static String browser = "chrome" ;

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

//		driver.findElement(By.ByXPath((//input[@class ='input_error form_input'])[1]));
//		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.close();

	}

}

// Xpath = //tagname[@Attribute='value'] syntax of xpath 

//absolute xpath (/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/div[1]/input)
//Relative xpath ((//input[@class ='input_error form_input'])[1]))

//Start Xpath = //tagname[starts-with(@Attribute,'value')] Example: //input[starts-with(@type,'pass')]
//Contains Xpath = //tagname[contains(@Attribute,'value')]Example: //input[contains(@type,'pass')]
//text Xpath = //tagname[text()='ActualText'] visible text 
// AND & OR operator Xpath = //tagname[@Attribute='value' or @Attribute='value'] & Xpath = //tagname[@Attribute='value' AND @Attribute='value']
//Axes method Xpath = //tagname[@Attribute='value']//parent::tagname - doubt 
//More Axes method are there 

//CSS selector later 05.10.2022