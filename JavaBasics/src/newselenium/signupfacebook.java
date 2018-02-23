package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class signupfacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver","D:\\Firefox.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("john");
		driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys("david");
		driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("9345678343");
		driver.findElement(By.xpath("//*[@id='u_0_q']")).sendKeys("password007");
		Select select =new Select(driver.findElement(By.xpath("//*[@id='month']")));
		select.selectByVisibleText("Jun");
		
		Select select1 =new Select(driver.findElement(By.xpath("//*[@id='day']")));
		select1.selectByVisibleText("15");
		Select select2 =new Select(driver.findElement(By.xpath("//*[@id='year']")));
		select2.selectByVisibleText("2001");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		driver.findElement(By.xpath("//*[@id='u_0_w']")).click();
        driver.quit();
	}

}
