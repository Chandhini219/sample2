package POM_Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class browser {
	public void botharecorrect(String name, String psswd) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		ObjectsBrowser.username(driver).sendKeys("Admin");
		ObjectsBrowser.password(driver).sendKeys("admin123");
		ObjectsBrowser.submit(driver).click();
		
    }
}
