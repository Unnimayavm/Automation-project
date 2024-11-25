package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@data-bind=\"scope: 'minicart_content'\"]")
	WebElement cart;
	
	@FindBy(id="top-cart-btn-checkout")
	WebElement checkout;
	
	//@FindBy(id="customer-email")
	//WebElement email;
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	

	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="street[0]")
	WebElement street;
	

	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="region_id")
	WebElement state;
	
	@FindBy(name="postcode")
	WebElement pcode;
	
	@FindBy(name="country_id")
	WebElement country;
	
	
	@FindBy(name="telephone")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")
	WebElement shipping;
	
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	//@FindBy(xpath="//*[text()=\"Next\"]")
	WebElement next;
	
	@FindBy(xpath="//button[@title=\"Place Order\"]/child::span")
	WebElement placeorder;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/div/a")
	WebElement countinueshopping;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement logout;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement logoutfinalclick;
	
    public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public void setValues(String fn,String ln,String cpny,String sadrs,String cty,String pcde,String pno) {
		//email.sendKeys(eml);
		
		fname.sendKeys(fn);
		
		lname.sendKeys(ln);
		company.sendKeys(cpny);
		street.sendKeys(sadrs);
        city.sendKeys(cty);
		pcode.sendKeys(pcde);
		phone.sendKeys(pno);
		
		}*/
	
	 public void cartclick() {
		    cart.click();
	 }
	 
	 public void checkoutclick() {
		 checkout.click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	 }
	 
	 /*public void stateclick() {
		 Select stateSelect=new Select(state);
			stateSelect.selectByIndex(2);
	 }
	 
	public void countryclick() {
		Select countrySelect=new Select(country);
		   countrySelect.selectByIndex(1);
	}*/
	 
	 public void shippingclick() throws InterruptedException {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		 shipping.click();
			
			  JavascriptExecutor executor = (JavascriptExecutor) driver;
			  executor.executeScript("arguments[0].scrollIntoView(true);", shipping);
			 
		 next.click();
	 }
	 public void placeorderclick() throws InterruptedException {
		
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].scrollIntoView(true);", placeorder);
		 
		 placeorder.click();
	 }
	 public void countinueshoppingclick() {
		 countinueshopping.click();
		 
	 }
	 
	 public void logoutclick() {
		 logout.click();
		 logoutfinalclick.click();
		 
	 }
	
	 
	 


}
