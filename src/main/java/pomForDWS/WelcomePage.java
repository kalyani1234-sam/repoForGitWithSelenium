package pomForDWS;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage() {
		// TODO Auto-generated constructor stub
	}
	
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	private @FindBys(value = @FindBy(xpath = "(//ul)[15]/li/a"))
	List<WebElement> list;
	public List<WebElement> getList() {
		return list;
	}
	
	
}
