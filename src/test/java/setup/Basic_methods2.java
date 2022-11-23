package setup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_methods2 {
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
		
//		 // seleniumdev doc for more details 
//		  driver.get("https://www.sugarcrm.com/au/request-demo/"); 
//		  driver.manage().window().maximize(); 
//		  // Thread.sleep(3000); 
//		  driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click(); 
//		  driver.findElement(By.name("email")).sendKeys("arun");
//		  // Thread.sleep(2000);
		 

		
//		 driver.findElement(By.name("email")).clear(); // clear the feild //
//		 System.out.println(driver.findElement(By.name("email")).getAttribute("class")); // to get a particular attribute value like class, name, id etc //
//		 System.out.println(driver.findElement(By.xpath( "//*[@id=\"field1\"]/div/input")).getCssValue("text-transform")); // will give u a css parameter value of a particular parameter in this case it will return uppercase 
//		 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize()); //width and height of the button 
//		 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation()); // top left and right like xy axis position 
//		 System.out.println(driver.findElement(By.className("radio-check-label")). getText()); // to display the visible text //
//		 System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName()); // tag name like input, div, a 
//		 System.out.println(driver.findElement(By.xpath( "//*[@id=\"field1\"]/div/input")).isDisplayed()); 
//		 System.out.println(driver.findElement(By.xpath( "//*[@id=\"field1\"]/div/input")).isEnabled()); 
//		 System.out.println(driver.findElement(By.xpath( "//*[@id=\"field1\"]/div/input")).isSelected());
		 

//		Dropdown using select and other is input type , now will see select 

		
//		 WebElement dropdown = driver.findElement(By.name("employees_c")); 
//		 Select select = new Select(dropdown); 
//		  select.selectByIndex(5); 
//		 Thread.sleep(2000);
//		 select.selectByValue("level1");
//		  Thread.sleep(2000);
//		 select.selectByVisibleText("51 - 100 employees");
//		  driver.close();
		  
		 // Multiselect functions // select.deselect when multiple things are selected and to remove eg skills dropdown
		

//		Print all link in  a website 
		
//		driver.get("https://www.sugarcrm.com/au/request-demo/"); 
//		Thread.sleep(3000); 
//  	  driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click(); 
//        driver.manage().window().maximize(); 
//       List<WebElement> all_tag = driver.findElements(By.tagName("a")); // to print all link on the website using the tagname 'a'
//        System.out.println(all_tag.size());
//        
//        for(int i =0; i<all_tag.size();i++) {
//        	System.out.println("Actual link on webpage "+all_tag.get(i).getAttribute("href")); // to print the actual website link using the attribute href
//        	System.out.println("Actual link on webpage "+all_tag.get(i).getText()); // to print the visibel text of the link 
//        }
        
//        Same cdoe is applicabel for deepdrop all to print all deepdrop values 
    
        
// hwo to work with autosuggestion dropdown like makemy trip del = delhi 
//        driver.get("https://www.makemytrip.com/"); 
//		Thread.sleep(3000); 
//  	    driver.manage().window().maximize();
//  	    driver.findElement(By.xpath("//span[text()='From']")).click(); // this xpath is by using the visible text 
//  	  Thread.sleep(3000); 
//  	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("syd");
//  	  Thread.sleep(3000); 
//  	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN); // play with arror keys
//  	  Thread.sleep(3000); 
//  	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
//  	  Thread.sleep(3000); 
//  	driver.close();
  	    
//  to move the page down we use action class 
		
//		 driver.get("https://www.makemytrip.com/"); 
//			Thread.sleep(3000); 
//	  	    driver.manage().window().maximize();
//	  	    WebElement appbtn = driver.findElement(By.className("getAppLinkBtn"));
//	  	    Actions actionobj = new Actions(driver); // action has to with driver not appbtn
//	  	    actionobj.moveToElement(appbtn); 
//	  	    actionobj.perform();
        
        
//		Switch between Frames ( when two segments in a webpage with seperate HTML code we use switch to switch frames)
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"); 		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		System.out.println("before click");
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println("after click");
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}
	

}
