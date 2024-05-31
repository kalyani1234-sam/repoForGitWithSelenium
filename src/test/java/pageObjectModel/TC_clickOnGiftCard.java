package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyFileUtils;
import pomForDWS.DwsGiftCardPage;

public class TC_clickOnGiftCard {

	PropertyFileUtils ps = new PropertyFileUtils();
	@Test
	public void giftcard() throws IOException, InterruptedException {
		
		String rName = ps.getDataFrmPropertyFile("receName");
		String rEmail = ps.getDataFrmPropertyFile("receEmail");
		String sName = ps.getDataFrmPropertyFile("senderName");
		String sEmail = ps.getDataFrmPropertyFile("senderEmail");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		DwsGiftCardPage gf = new DwsGiftCardPage(driver);
		Thread.sleep(3000);
		
		gf.clickGC();
		Thread.sleep(3000);
		gf.clickOngiftCard();
		Thread.sleep(3000);
		gf.getReceName(rName);
		Thread.sleep(3000);
		gf.getReceEmail(rEmail);
		Thread.sleep(3000);
		gf.gerSenderName(sName);
		Thread.sleep(3000);
		gf.getSenderEmail(sEmail);
		Thread.sleep(3000);
		gf.clickONATCbtn();
		Thread.sleep(3000);
	}
}
