package storeProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindingTheLinks {
	
		public static WebDriver driver;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://localhost/stock/login.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='username']")).clear();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ram");
		driver.findElement(By.xpath("//*[@id='password']")).clear();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Store$$$$1234&&&&");
		driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
	}
	
	@Test
	public void FindingLinks(){
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		
		
		}
	
	
	}


@AfterMethod
public void teardown(){
	
}


}
