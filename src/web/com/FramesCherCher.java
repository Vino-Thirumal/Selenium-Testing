package web.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCherCher {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Not a Friendly Topic']"));
		
		String text = ele.getText();
		
	//	driver.switchTo().frame("frame1");		//frame(id)
		
		driver.switchTo().frame("iamframe");	//frame(name)
		
		WebElement topic = driver.findElement(By.xpath("//input[@type='text']")); //xpath for topic
		
		topic.sendKeys(text);
		
		driver.switchTo().frame("frame3");		//frame(id value)
		
		WebElement checkBox = driver.findElement(By.id("a"));//id for checkbox
		
		checkBox.click();
		
	//	driver.switchTo().frame("frame2"); // it will not work bcz frame2 was in another frame.		
	//	driver.switchTo().parentFrame();		
	//	driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent(); // instead we use multiple parentframes to come out from any iframe to outer webpage, 
											// we simply use defaultContent()		
		driver.switchTo().frame("frame2");
		
		WebElement animalddn = driver.findElement(By.id("animals"));
		
		animalddn.click();
		
		List<WebElement> selectall = driver.findElements(By.xpath("//*[@id='animals']/option")); //to select all options inside animal dropdown.
		
		for(int i =0; i<selectall.size(); i++) {
		
		System.out.println("Animal DropDown Option in index " + i + " is " + selectall.get(i).getText());		
		
	}
	}
}
