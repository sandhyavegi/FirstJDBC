package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderanddatepickup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
	String dateval="7-2-2018";
	selectdate(date,driver,dateval);
	}


public static void selectdate(WebElement element,WebDriver driver,String dateval){
	JavascriptExecutor js= ( JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"')", element);
	

driver.quit();


}
}
