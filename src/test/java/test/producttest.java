package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Baseclass;
import page.login;
import page.product;
import util.Excelutil;

public class producttest  extends Baseclass {
	
	@Test
	
	public void verifyLoginWithValidCread() throws InterruptedException {
		login p1 =new login(driver);
		
		String x1="C:\\automation\\selenium\\lumaautomation_original.xlsx";
		String sheet="Sheet2";
		int rowCount = Excelutil.getRowCount(x1, sheet);
		System.out.println(rowCount);
		        p1.signinclick();
			    Thread.sleep(2000);
			    p1.setValues("bivinkk@gmail.com","BIVINkk1234");//direct value send so no loop added here
			    p1.buttonclick();
			    
				Thread.sleep(1000);
				driver.get("https://magento.softwaretestingboard.com/");
				
				product pdt=new product(driver);
			    pdt.women();
			    pdt.tops();
			    pdt.breath();
			    pdt.size();
			    pdt.colour();
			    pdt.addtocart();
		}
}


	



