package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration {
	
WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement register;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="email_address")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="password-confirmation")
	WebElement cpwd;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement create;
	
	public registration (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void setValues(String fn,String ln,String eml,String pw,String cpd) {
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		email.sendKeys(eml);
		pwd.sendKeys(pw);
		cpwd.sendKeys(cpd);
		}
	
	public  void register() {
		register.click();

	}
	public void create() throws InterruptedException {
		Thread.sleep(2000);
		create.click();
	}
	
	

}
