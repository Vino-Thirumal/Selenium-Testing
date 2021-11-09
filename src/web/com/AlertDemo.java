package web.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/Alerts.html");		
		driver.manage().window().maximize();
		
		WebElement alertOk = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));		
		alertOk.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));		
		button.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
				e.printStackTrace();	}	
		
		Alert alert1 = driver.switchTo().alert();
		
	//	alert1.accept(); // output: you pressed ok		
		alert1.dismiss();  // output: you pressed cancel
				
		WebElement confirmbox = driver.findElement(By.id("demo"));
		
		System.out.println("1st Alert : Press a button - " + confirmbox.getText());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
				e.printStackTrace();	}
		
		WebElement alertPrompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));		
		alertPrompt.click();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button1.click();
		
		Alert alert2 = driver.switchTo().alert();		
		alert2.accept();
		
		WebElement promptBox = driver.findElement(By.id("demo1"));		
		System.out.println("2nd Alert : Message - " + promptBox.getText());			
	}
}
