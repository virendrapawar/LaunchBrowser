import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	public static void main(String[] args) {
		
		

       // System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
		
		// First is Set up the Chrome driver 
		WebDriverManager.chromedriver().setup();
		
        // COde for launch the Browser.
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// which site we need to launch in chrome.		
		 driver.navigate().to("http://www.google.com/");  
		
		 String pageTitle=driver.getTitle();
		 
		 String PageURL= driver.getCurrentUrl();
		 
		 System.out.println("I got this page title and name is " + pageTitle);
		 
		 System.out.println("I got this page URL  is " + PageURL);
		
		
		
	}
}
