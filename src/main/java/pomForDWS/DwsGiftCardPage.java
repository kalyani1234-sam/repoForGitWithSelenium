package pomForDWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsGiftCardPage {

	 public DwsGiftCardPage() {
	}
	 
	public DwsGiftCardPage(WebDriver driver){
		 
		PageFactory.initElements(driver, this);
	 }
	
	private @FindBy(xpath = "//ul[@class='top-menu']/li[7]")
	WebElement giftcart;
	
	public void clickGC() {
		giftcart.click();
	}
	
	private @FindBy(css = "div[data-productid='1']")
	WebElement product1;
	
	public void clickOngiftCard() {
		product1.click();
	}
	
	private @FindBy(name = "giftcard_1.RecipientName")
	WebElement receName;
	
	public void getReceName(String val) {
		receName.sendKeys(val);
	}
	
	private @FindBy(name = "giftcard_1.RecipientEmail")
	WebElement receEmail;
	
	public void getReceEmail(String val) {
		receEmail.sendKeys(val);
	}
	
	private @FindBy(name = "giftcard_1.SenderName")
	WebElement senderNAme;
	
	public void gerSenderName(String val) {
		senderNAme.sendKeys(val);
	}
	
	private @FindBy(name = "giftcard_1.SenderEmail")
	WebElement senderEmail;
	
	public void getSenderEmail(String val)
	{
		senderEmail.sendKeys(val);
	}
	
	private @FindBy(id = "add-to-cart-button-1")
	WebElement addTCartBTN;
	
	public void clickONATCbtn() {
		addTCartBTN.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
