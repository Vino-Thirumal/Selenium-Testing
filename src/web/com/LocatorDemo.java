
package web.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of the webpage- " + driver.getTitle());		
		System.out.println("URL of the given App- " + driver.getCurrentUrl());
		
        WebElement username = driver.findElement(By.id("email"));  
//(or)  WebElement username = driver.findElement(By.name("email")); 
		
    	username.sendKeys("rvinothini@gmail.com");
				
		System.out.println("Username Value- " + username.getAttribute("value"));		
		System.out.println("user PlaceHolder- " + username.getAttribute("placeholder"));		
		System.out.println("user dataID- " + username.getAttribute("data-testid"));		
		System.out.println("user type- " + username.getAttribute("type"));		
		System.out.println("user class- " + username.getAttribute("class"));				
		System.out.println("user al- " + username.getAttribute("aria-label"));		
		System.out.println("user id- " + username.getAttribute("id"));		
		System.out.println("user name- " + username.getAttribute("name"));
		
//(or)  WebElement password = driver.findElement(By.id("pass"));
        WebElement password = driver.findElement(By.name("pass"));		
		
		password.sendKeys("123456789");
		
		System.out.println("Password Value- " + password.getAttribute("value"));		
		System.out.println("pass dataID- " + password.getAttribute("data-testid"));		
        System.out.println("pass PlaceHolder- " + password.getAttribute("placeholder"));			
		System.out.println("pass al- " + password.getAttribute("aria-label"));		
		System.out.println("pass type- " + password.getAttribute("type"));		
		System.out.println("pass class- " + password.getAttribute("class"));		
				
		WebElement login = driver.findElement(By.name("login"));
				
		System.out.println("login type- " + login.getAttribute("type"));		
		System.out.println("login class- " + login.getAttribute("class"));		
		System.out.println("login id- " + login.getAttribute("id"));  
		
		login.click();		
		}
}
