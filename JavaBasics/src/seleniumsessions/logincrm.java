package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logincrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://www.freecrm.com/index.html");
driver.findElement(By.name("username")).sendKeys("naveenk");

driver.findElement(By.name("password")).sendKeys("test@123");
driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	}

}
