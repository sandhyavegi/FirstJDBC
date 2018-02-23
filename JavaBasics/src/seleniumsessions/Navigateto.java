package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.de/");
driver.navigate().to("https://www.ebay.com/");	
Thread.sleep(2000);
driver.navigate().back();





	
	
	
	
	
	
	
	}

}
