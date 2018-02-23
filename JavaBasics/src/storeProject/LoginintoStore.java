package storeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginintoStore {
public static WebDriver driver;
	
	@BeforeMethod
	public  void setup(){
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
	public void enterusers() throws InterruptedException{
//driver.findElement(By.linkText("Administrator")).click();	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("Administrator"))).build().perform();
	driver.findElement(By.linkText("Users")).click();
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus ewIcon']")).click();
	driver.findElement(By.xpath("//*[@id='x_Username']")).sendKeys("Adam123");
	driver.findElement(By.xpath("//*[@id='x_Password']")).sendKeys("Store1234$$$$&&&&");
	driver.findElement(By.xpath("//*[@id='x__Email']")).sendKeys("Adam1234d@gmail.com");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[@class='btn btn-primary ewButton']")).click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='btnAction']")));
	//driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")));
	
	JavascriptExecutor js2= (JavascriptExecutor)driver;
	js2.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")));
	
	
	driver.findElement(By.xpath("//*[@id='logout']")).click();
	//Alert alert=driver.switchTo().alert();
	//alert.accept();
	JavascriptExecutor js3= (JavascriptExecutor)driver;
	js3.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")));
	//driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	
	
	}

@AfterMethod
public void teardown(){
	
	driver.quit();



}



}


