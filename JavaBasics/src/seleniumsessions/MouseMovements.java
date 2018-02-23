package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");

	Actions action=new Actions(driver) ;
	action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
	action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("FAQ")).click();
	driver.quit();
	
	}

}
