package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		System.out.println("before ogin title"+driver.getTitle());
		
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	System.out.println("after login title is"+driver.getTitle());
	
	
	
	
	
	
	}

}
