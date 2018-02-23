package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\Extent.html");

	
	
	}

}
