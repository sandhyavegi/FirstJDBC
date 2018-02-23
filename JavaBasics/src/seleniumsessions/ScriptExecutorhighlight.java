package seleniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecutorhighlight {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@124");

		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		flash(loginbtn, driver);
		// drawBorder(loginbtn,driver);
		// File src =
		// ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//
		// FileUtils.copyFile(src, new
		// File("D:\\work_java\\JavaBasics\\src\\seleniumsessions\\element.png"));

		// generateAlert(driver,"the is an issuse on the ok button");

		WebElement link = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		clickonElement(link, driver);
		RefreshBrowser(driver);
		System.out.println(Gettitle(driver));
		//System.out.println(InnerText(driver));
//Scroll(driver);
WebElement forgot=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
Scrollinto(forgot,driver);
	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroungColour");
		for (int i = 0; i < 20; i++) {
			changeColour("rgb(0,200,0)", element, driver);
			changeColour(bgcolor, element, driver);

		}
	}

	public static void changeColour(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}

	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void clickonElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void RefreshBrowser(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String Gettitle(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document .title;").toString();
		return title;
	}

	public static String InnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String page = js.executeScript("return document.documentElement.innerText;").toString();
		return page;

	
	}
	
	
	public static void Scroll(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	
	
	public static void Scrollinto(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	
	}	
	
	
}