package POM_Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectsBrowser {
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}

	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	}
}
