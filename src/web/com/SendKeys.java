
package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("rvinothini");		

		driver.findElement(By.id("email")).sendKeys("eee@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.id("pass")).sendKeys("67890");
		
		WebElement ele = driver.findElement(By.name("email"));
		
				ele.sendKeys("vino");
				ele.clear();
								
				ele.sendKeys("வணக்கம்");
				ele.sendKeys("आप से मिलकर खुशी हुई");
				ele.submit();
				
			//	ele.clear();
			//	ele.sendKeys(null);  //when we pass null value, we get IllegelArgumentException
			//	ele.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));  //Keys-Enum
				
//		WebElement ele1 = driver.findElement(By.name("login"));		
//		ele1.sendKeys(Keys.ENTER);
						
//		driver.findElement(By.name("login")).click();		
	}
}


