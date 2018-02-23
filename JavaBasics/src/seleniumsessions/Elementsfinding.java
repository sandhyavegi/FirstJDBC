package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elementsfinding {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		// driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("Tompeter@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		//driver.findElement(By.id("id_gender2")).click();
		//driver.findElement(By.id("customer_firstname")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customer_firstname")).sendKeys("tom");
		driver.findElement(By.id("customer_lastname")).sendKeys("peter");
		driver.findElement(By.id("email")).sendKeys("Tompeter.@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("password007");
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='days']")));
		select.selectByVisibleText("12");
		
		Select select1 = new Select(driver.findElement(By.id("months")));
		select1.selectByVisibleText("May");
		
		Select select2 = new Select(driver.findElement(By.id("years")));
		select2.selectByVisibleText("2014");
		
		driver.quit();

	}

}
