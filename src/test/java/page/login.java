package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement signin;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement passwd;
	
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement Sbutton;
	
	public login (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void setValues(String email,String pswd) {
		Email.sendKeys(email);
		passwd.sendKeys(pswd);
		}
	
	public  void signinclick() {
		signin.click();
		
	}
	
	public void buttonclick() {
		Sbutton.click();
	}
	
}
