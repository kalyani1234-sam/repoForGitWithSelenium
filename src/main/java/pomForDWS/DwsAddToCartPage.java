package pomForDWS;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class DwsAddToCartPage {
	
	public DwsAddToCartPage() {
		// TODO Auto-generated constructor stub
	}
	
	public DwsAddToCartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//ul[@class='top-menu']/li[5]")
	WebElement digitaldw;
	
	public WebElement getDigitaldw() {
		return digitaldw;
	}

	private @FindBys(value = @FindBy(css  = "input[class='button-2 product-box-add-to-cart-button']"))
	List<WebElement> products;
	public List<WebElement> getProducts() {
		System.out.println(products);
		return products;
	}
}
