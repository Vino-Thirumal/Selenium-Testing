

package web.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//To set the chromedriver path.
//		
//		WebDriver driver = new ChromeDriver(); //WebDriver-Interface, ChromeDriver- Predefined Class
//		                                       // To Launch Chrome Browser with blank url.
//		
		
//		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
//		
//		WebDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
//		
//		WebDriver driver = new OperaDriver();
				
	}

}
