
package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathFB {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title:- " + driver.getTitle());
		
		System.out.println("URL:- " + driver.getCurrentUrl());
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("rvinothinieee");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234567");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();	
	}
}
