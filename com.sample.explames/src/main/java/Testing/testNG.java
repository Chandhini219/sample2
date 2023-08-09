package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class testNG {
	
	@BeforeSuite
	public void before()
	{
		System.out.println("Before Suite");	
	}
	
	@AfterSuite
	public void after()
	{
		System.out.println("After Suite");	
	}
	
	@BeforeTest
	public void first()
	{
		System.out.println("Before Test");
	}


	@AfterTest
	public void second()
	{
		System.out.println("After Test");
	}
	
 
	@BeforeClass
	public void three()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void four()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void five()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void six()
	{
		System.out.println("After Method");
	}
	
	@Test(priority=1)
	 public void beight()
	 {
		System.out.println("Test-1");
	 }
	
	@Test(priority=0)
	 public void nine()
	 {
		System.out.println("Test-2");
	 }
}
