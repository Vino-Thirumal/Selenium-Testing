package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title- " + driver.getTitle());
		
		System.out.println("URL- " + driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys("rvinothinieee@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		driver.findElement(By.name("login")).click();
		
	    WebElement text = driver.findElement(By.className("_9ay7"));
	    	   
	    String innerText = text.getAttribute("innerText");

	    System.out.println(innerText);
	    
	    System.out.println(text.getText());  
	    
	    System.out.println(driver.findElement(By.className("_50f6")).getAttribute("innerText"));
	    
	    System.out.println(driver.findElement(By.className("_50f6")).getText());	    

	}

}
