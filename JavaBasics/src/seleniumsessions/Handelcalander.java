package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handelcalander {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		String data = "2-February-2018";
		String dataArr[] = data.split("-");
		String day = dataArr[0];
		String month = dataArr[1];
		String year = dataArr[2];
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]

		String beforexpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";

		String afterxpath = "]/td[";

	final int weekdays=7;
	for(int i=2;i<=7; i++){
		for(int c=1;c<=weekdays;c++){
		String dayval = driver.findElement(By.xpath(beforexpath+i+afterxpath+c+"]")).getText();
		
	System.out.println(dayval);
		if(dayval.equals(day)){
			driver.findElement(By.xpath(beforexpath+i+afterxpath+c+"]")).click();
		break;
		}
		}
	break;
	}

	}
}