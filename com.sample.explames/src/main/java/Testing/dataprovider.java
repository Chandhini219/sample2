package Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataprovider {
	WebDriver driver;
	
	@BeforeSuite
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(1000);
	}
	
	
	public String[][] exceldataaccess() throws BiffException, IOException
	{
		FileInputStream filepath=new FileInputStream("‪D:\\testdata.xlsx");
		Workbook workbook=Workbook.getWorkbook(filepath);
		Sheet sheet=workbook.getSheet(0);
		int rows=sheet.getRows();
		int column=sheet.getColumns();
		String value[][]=new String[rows-1][column];
		for(int i=1;i<rows;i++) {
		for(int j=0;j<column;j++) {
		value[i-1][j]=	sheet.getCell(j, i).getContents();
		}
		}
		return value;
			}


	
	@DataProvider(name="dataprovidermethod")
	public String[][] dataprovidermethod() throws BiffException, IOException
	{
		String[][] data=null;
		data=exceldataaccess();
		return data;
	}
	

	
	@Test(dataProvider = "dataprovidermethod")
	public void hitBrowser(String uuname, String upswd) throws InterruptedException 
	{
	
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(uuname);
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys(upswd);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        submit.click();
        
	}
        
        public void browserclose()
        {
        	driver.quit();
        }
        
	
	

}
