package seleniumsessions;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
driver.findElement(By.id("lst-ib")).sendKeys("selenium");

List<WebElement> link = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	System.out.println(link.size());
	
	for(int i=0; i<link.size(); i++){
		
		System.out.println(link.get(i).getText());
		if(link.get(i).getText().contains("selenium grid")){
	link.get(i).click();
		break;
	}
	
	}
	}

}
