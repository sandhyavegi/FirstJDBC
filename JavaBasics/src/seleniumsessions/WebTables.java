package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'abram1 RRnn')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();

	
	
	
	
	
	}

}
