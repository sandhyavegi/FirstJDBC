package seleniumsessions;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit .SECONDS );
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.ebay.de/");
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	links.addAll(driver.findElements(By.tagName("img")));
	
	List<WebElement> activelinks=new ArrayList<WebElement>();
	for(int i=0;i<links.size();i++){
	if(	links.get(i).getAttribute("href")!=null){
		activelinks.add(links.get(i));
		}
	}
	
	System.out.println(activelinks.size());
	
	for(int j=0;j<activelinks.size();j++){
		
	HttpURLConnection connection=(HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
	
	connection.connect();
	String response=connection.getResponseMessage();
	connection.disconnect();
	System.out.println(activelinks.get(j).getAttribute("href")+"====>"+response);
	
	
	
	}
	
	
	
	
	}

}
