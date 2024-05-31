package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrderOfTestNGAnnotation {

	@BeforeSuite
	public void BS() {
		System.out.println("writing logic for database connections");
	}

	@BeforeTest
	public void Bt() {
		System.out.println("@BeforeTest");
		System.out.println("pre condition for test method ");
		
	}
	
	@BeforeClass
	public void Bc() {
		System.out.println("@BeforeClass");
		System.out.println("pre condition for testcase ");
	}
	
	@BeforeMethod
	public void hiii() {
		System.out.println("@BeforeMethod 1");
	}
	
	@BeforeMethod
	public void abc() {
		System.out.println("@BeforeMethod 2");
		//at time of execution same annotations are executing according to there alphabet(ascii code)
	}
	@Test
	public void testCase1() {
		System.out.println("testcase1");
	}
	
	
	@Test
	public void testCase2() {
		System.out.println("testcase2");
	}
	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("@AfterClass");
		System.out.println("post condition for test case ");
	}
	
	@AfterTest
	public void at() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("@AfterSuite");
		System.out.println("post condition for test method ");
	}
	
	@AfterSuite
	public void as2() {
		System.out.println("@AfterSuite2");
		System.out.println("logic for database disconnection");
	}
	
	
	
	
	
}
















