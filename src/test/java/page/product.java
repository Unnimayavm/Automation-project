package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class product {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement women;
	
	@FindBy(xpath="//*[@id=\"ui-id-9\"]")
	WebElement tops;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")
	WebElement breath;
	
	@FindBy(id="option-label-size-143-item-166")
	WebElement size;
	
	@FindBy(id="option-label-color-93-item-57")
	WebElement colour;
	
	
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]/span")
	WebElement addtocart;
	
public product (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
      public void women() throws InterruptedException {
    	  
       Actions act=new Actions(driver);
  		act.moveToElement(women).perform();
  		
    	  }
      
     public void tops() throws InterruptedException {
    	 
    	  Actions act=new Actions(driver);
    		act.moveToElement(tops).click().perform();
    	 
      }
      public void breath() {
    	  breath.click();
      }
      
        public void size() {
    	  size.click();
      }
      
      public void colour() {
    	  colour.click();
      }
      
      public void addtocart() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  addtocart.click();
      }
      
     

    
}
