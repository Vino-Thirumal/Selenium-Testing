

package web.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");   //way-1 using frame name
		
//  	driver.switchTo().frame(0);              //way-2 using Index
		
//		WebElement ele = driver.findElement(By.xpath("//*[@name='login_page']"));  //way-3 using web element 
//		
//		driver.switchTo().frame(ele);
		
		WebElement customerID = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		
		customerID.sendKeys("123456789");        	
		
	}

}
