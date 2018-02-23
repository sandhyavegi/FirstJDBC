package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
			
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().fullscreen();
driver.manage().deleteAllCookies();

 driver.get("https://www.google.de/search");
 
	
	
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Google")){
		System.out.println("title is correct");
	}
	else{
		System.out.println("title not correct");
	}
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	
	
	
	}

}
