package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcardLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='_39M2dM']/input")).sendKeys("abcd@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password009");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='_1avdGP']/button")).click();

	}

}
