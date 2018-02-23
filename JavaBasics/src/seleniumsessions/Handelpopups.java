package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelpopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.rediff.com");
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(2000);
driver.findElement(By.name("proceed")).click();
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
	}

}
