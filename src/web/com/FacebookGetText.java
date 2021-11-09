
package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGetText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title:- " + driver.getTitle());
		
		System.out.println("URL:- " + driver.getCurrentUrl());
		
		System.out.println("Top Font:- " + driver.findElement(By.className("_8eso")).getText()); 
		
		System.out.println("Bottom Font:- " + driver.findElement(By.className("_58mk")).getText()); 
		
		System.out.println("Middle Font:- " + driver.findElement(By.className("_8esn")).getText()); 

	}

}
