package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title:- " + driver.getTitle() );
		
		System.out.println("URL:- " + driver.getCurrentUrl());
		
		WebElement userName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		userName.sendKeys("rvinothinieee@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/form/div[1]/div/div/input"));
		password.sendKeys("123456789");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/form/div/button"));
		login.click();
	}

}
