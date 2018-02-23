package seleniumsessions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Objectrepository {

	static WebDriver driver;
	static Select select;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\work_java\\JavaBasics\\src\\seleniumsessions\\config.properties");

	prop.load(ip);
	
	
	
	String browserName=prop.getProperty("browser");
	String URL=prop.getProperty("url");
	
	if(browserName.equals("chrome")){
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	
	}else if(browserName.equals("firefox")){
		System.setProperty("webdriver.firefox.driver", "C:\\SeleniumDrivers\\GeckoDriver.exe");
		 driver = new FirefoxDriver();	
	
	}
		
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get(URL);
	driver.findElement(By.xpath(prop.getProperty("firstxpath"))).sendKeys(prop.getProperty("firstname"));
	driver.findElement(By.xpath(prop.getProperty("lastxpath"))).sendKeys(prop.getProperty("lastname"));
	driver.findElement(By.xpath(prop.getProperty("userxpath"))).sendKeys(prop.getProperty("username"));
	
	driver.findElement(By.xpath(prop.getProperty("createpass"))).sendKeys(prop.getProperty("create"));
	
	driver.findElement(By.xpath(prop.getProperty("confirmpass"))).sendKeys(prop.getProperty("confirm"));
	Thread.sleep(2000);
	
driver.findElement(By.xpath("//div[contains(@class,'goog-inline-block goog-flat-menu-button-dropdown')]")).click();
List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'goog-menu goog-menu-vertical')]//div"));
	
System.out.println(list.size());
for(int i=0;i<list.size();i++){
	System.out.println(list.get(i).getText());
	
if(list.get(i).getText().equals("May")){
	list.get(i).click();
}



}
	
	 driver.findElement(By.xpath(prop.getProperty("dayxpath"))).sendKeys(prop.getProperty("day"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("yearxpath"))).sendKeys(prop.getProperty("year"));
			
	
	
	
	
	
	}

}
