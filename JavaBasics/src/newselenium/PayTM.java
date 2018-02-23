package newselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTM {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
//	 WebElement element =driver.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]"));
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", element);
		//driver.switchTo().frame("iframe");
		driver.findElement(By.cssSelector("div[class='_3ac-']")).click();

	}

}
