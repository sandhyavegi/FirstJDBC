package newselenium;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.de/");
driver.findElement(By.id("lst-ib")).sendKeys("java ");
Thread.sleep(2000);

	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getText());
	if(list.get(i).getText().contains("java array")){
          list.get(i).click();
		break;
	}
	
	
	}
	
	}
}
	
	
	
	
	
	


