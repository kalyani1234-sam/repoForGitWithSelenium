package commonUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;

	 public PropertyFileUtils ps = new PropertyFileUtils();

	@BeforeSuite
	public void BS() {
		System.out.println("writing logic for database connections");

	}

	@BeforeTest
	public void Bt() {
		System.out.println("@BeforeTest");
		System.out.println("pre condition for test testRunner ");

	}


	@BeforeClass
	public void openBrowser() throws IOException {
		 String url = ps.getDataFrmPropertyFile("url");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.navigate().to(url);
	}

	
	@BeforeMethod
	public void login() throws IOException {
		System.out.println("pre condition for testcase that is login");
		// at time of execution same annotations are executing according to there
		// alphabet(ascii code)

		 String email = ps.getDataFrmPropertyFile("email");
		 String password = ps.getDataFrmPropertyFile("password");

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();

		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).sendKeys(password);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass");
		System.out.println("post condition for test case ");

		driver.close();
	}

	@AfterTest
	public void at() {
		System.out.println("@AfterTest");
		System.out.println("post condition for test runner ");
	}

	@AfterSuite
	public void as() {
		System.out.println("disconnection for database");

	}

}
