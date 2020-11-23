package sanityTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SanityTest {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is supposed to be run before the method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is run before the test");
	}
	
	
	
	@Test(groups="Sanity")
	public void test1()
	{
		System.out.println("this is the test 1");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("this is run after the test");
	}
	

}
