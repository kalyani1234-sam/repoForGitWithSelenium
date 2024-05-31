package Assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNgBasic.BaseClass;

public class ScrollingTillFollowUs extends BaseClass {

	@Test
	public void scrollTillFlUs() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.navigate().refresh();
		List<WebElement> los = driver.findElements(By.xpath("(//ul)[15]/li/a"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow.toString() + "main window");
		for (WebElement webElement : los) {
			webElement.click();
			Set<String> allWindow = driver.getWindowHandles();
			// System.out.println(allWindow);

			for (String windowhandle : allWindow) {
				if (!windowhandle.equals(mainWindow)) {
					String han = driver.switchTo().window(windowhandle).getTitle();
					System.out.println(han + "handle name");
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(mainWindow);

				}
			}

		}
		Thread.sleep(2000);

	}

}
