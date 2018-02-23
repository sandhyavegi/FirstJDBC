package seleniumsessions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.de");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\work_java\\JavaBasics\\src\\seleniumsessions\\screenshot.png"));
	driver.quit();
	WebDriverWait wait = new WebDriverWait (driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	
	}

}
