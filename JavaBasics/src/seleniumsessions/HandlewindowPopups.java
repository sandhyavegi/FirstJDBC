package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlewindowPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://www.popuptest.com/goodpopups.html");

	driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
	Thread.sleep(2000);
	Set<String> handles=driver.getWindowHandles();
	
	
	Iterator<String> it=handles.iterator();
	Thread.sleep(2000);
	String parentwindow=it.next();
	System.out.println("parent window is"+parentwindow);
	Thread.sleep(2000);
	String childwindow=it.next();
	System.out.println("child window is"+childwindow);
	
	driver.switchTo().window(childwindow);
	driver.close();
	
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	
	}

}
