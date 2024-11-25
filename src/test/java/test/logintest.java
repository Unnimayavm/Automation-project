package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.login;
import util.Excelutil;



public class logintest  extends Baseclass {
	
	@Test
	
	public void verifyLoginWithValidCread() throws InterruptedException {
		login p1 =new login(driver);
		
		String x1="C:\\automation\\selenium\\magentoregpage.xlsx";
		String sheet="Sheet2";
		int rowCount = Excelutil.getRowCount(x1, sheet);
		System.out.println(rowCount);
		
		for (int i= 1; i <= rowCount;i++)
		  {
			int cellCount = Excelutil.getCellcount(x1, sheet, i);
			System.out.println("Cell Count: "+cellCount);
			
			for (int j = 0; j< cellCount; j += 2) { 
				String email = Excelutil.getCellValue(x1, sheet, i, j);
				System.out.println("UserName = " + email);
			    String pwd = Excelutil.getCellValue(x1, sheet, i, j + 1);
				System.out.println("Password = " + pwd);
				
			    p1.signinclick();
			    Thread.sleep(2000);
			    p1.setValues(email, pwd);
			    p1.buttonclick();
			    
				//login validation//
				String act_url=driver.getCurrentUrl();
				String exp_url="https://magento.softwaretestingboard.com/";
				
				if(act_url.equalsIgnoreCase(exp_url)){
				  System.out.println("login success");
				  break;
				}
				
				else {
					System.out.println("login failed");
				}
					Thread.sleep(1000);
					driver.get("https://magento.softwaretestingboard.com/");
				}
		
	}
		}
	}


