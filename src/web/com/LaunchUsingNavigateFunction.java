
package web.com;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUsingNavigateFunction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
		
//		driver.navigate().forward();
		
//		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
//		driver.manage().window().minimize();
		
//		Options manage = driver.manage();
//		 
//		Window window = manage.window();
//		 
//		window.maximize();		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}
	}
