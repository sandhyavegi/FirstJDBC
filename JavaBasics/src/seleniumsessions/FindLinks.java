package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.ebay.com/");
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	
	for(int i=0;i<link.size();i++){
		String text=link.get(i).getText();
	System.out.println(text);
	driver.quit();
	}
	
	
	
	
	
	}

}
