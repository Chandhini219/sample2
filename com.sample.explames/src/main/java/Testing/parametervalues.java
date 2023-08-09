package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametervalues {
   
    @Test()
    @Parameters({"unamee","psswdd"})
    public void botharecorrect(String name, String psswd) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(name);
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys(psswd);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        submit.click();
    
    }

	
	
}
