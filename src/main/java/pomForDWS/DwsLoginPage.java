package pomForDWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginPage {
	
	public DwsLoginPage() {
		// TODO Auto-generated constructor stub
	}
	public DwsLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	private  @FindBy(id = "Email")
	WebElement username;
	
	private @FindBy(id = "Password")
	WebElement pass;
	
	private @FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;

	public void Username(String value) {
		username.sendKeys(value);
	}
	public void Pass(String value) {
		pass.sendKeys(value);
	}
	public void LoginButton() {
		loginButton.click();
	}
	
	
}
