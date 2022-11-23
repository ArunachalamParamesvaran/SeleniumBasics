package setup;

import java.util.Iterator;
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

public class Basic_methods3 {
	

	public static void main(String[] args) throws InterruptedException {   
        
////		Switch between Frames ( when two segments in a webpage with seperate HTML code we use switch to switch frames)
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"); 		
//		driver.manage().window().maximize();
//		System.out.println("before click");
//		driver.switchTo().frame("iframeResult"); // to switch from one frame to another
//		driver.findElement(By.xpath("/html/body/button")).click();
//		Thread.sleep(3000);
//		System.out.println("after click");
//		System.out.println(driver.switchTo().alert().getText()); // Handle alerts pop-up
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();// Handle alerts pop-up
//		Thread.sleep(1000);
//		driver.quit();
		
//	handle multiple tab 
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.salesforce.com/au/"); 
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[1]/div/a/span")).click();
//		Thread.sleep(3000);		
////		Handeling the windows using windown handles
//		Set<String> windowhandle = driver.getWindowHandles();
//		System.out.println(windowhandle);
////		using iterator and storing the handles of both parent and child to use them 
//		Iterator<String> iterator = windowhandle.iterator();
//		String parentw = iterator.next();
//		String child = iterator.next();
//		driver.switchTo().window(child);
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.findElement(By.name("UserFirstName")).sendKeys("arun");
//		driver.findElement(By.name("UserLastName")).sendKeys("last");
//		driver.quit();
		
//	Mouse over operations 
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.ebay.com/"); 
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]"));
////		use action class to mouse over elements
//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
	
//	Drag & Drop
//											--------failed---
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop"); 
//		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
//		System.out.println("Switched");
//		WebElement drag1 = driver.findElement(By.xpath("/html/body/img"));
//		WebElement drop2 =driver.findElement(By.xpath("/html/body/div"));
//		System.out.println("Switched");
//		Actions actionobj = new Actions(driver);	
//		actionobj.dragAndDrop(drag1, drop2).perform();
//		
//		Thread.sleep(5000);
//											--------failed---
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp"); 
//		driver.manage().window().maximize();		
//		System.out.println("Switched");
//		WebElement drag1 = driver.findElement(By.id("drag1"));
//		WebElement drop2 =driver.findElement(By.id("div2"));
//		System.out.println("Switched");
//		Actions actionobj = new Actions(driver);	
//		actionobj.dragAndDrop(drag1, drop2).perform();
//		
//		Thread.sleep(5000);
		
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://demo.automationtesting.in/Static.html"); 
//		driver.manage().window().maximize();		
//		WebElement drag1 = driver.findElement(By.id("angular"));
//		WebElement drop2 = driver.findElement(By.id("droparea"));
//				Actions actionobj = new Actions(driver);	
//		actionobj.dragAndDrop(drag1, drop2).perform();
//		
//		Thread.sleep(5000);
		
//How to handle resize a element like drag pts no.28		dragand drop method
//		how to Automate slider like vol 					drag and drop method
		
//		do right click
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		Actions actionobj = new Actions(driver);
////		actionobj.contextClick().perform(); // random right click on a webpage 
////		Thread.sleep(1000);
//		WebElement input = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")); // to click on specific element
//		actionobj.contextClick(input).perform(); // to click on specific element
//		Thread.sleep(3000);// why cant we use two right click on a same session ? 
		
//	Keyboard actions	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[4]/pre/span"));
		Actions actionobj = new Actions(driver);
		actionobj.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//div[5]/div[6]/pre"));
		actionobj.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(3000);
		
//	Wait
//		implicit wait	- max wait time it is applicabel to all webelemtn
//		explicit wait - wait for sometime but only applicabel to certain webelement 
//		Fluent wait - max wait , regular internal it will check element 
		
		
	}
	

}
