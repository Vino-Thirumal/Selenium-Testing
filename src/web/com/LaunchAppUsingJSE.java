

package web.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAppUsingJSE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();                //up or top casting
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; // down or bottom casting
		
		String url = "https://www.facebook.com";
		
		jse.executeScript("window.location = ' "+ url +" ' ");
		
	//	jse.executeScript("window.location = 'https://www.facebook.com'");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
