package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.registration;
import util.Excelutil;

public class registrationtest  extends Baseclass{
	
	@Test
		public void register() throws InterruptedException {
		registration log=new registration(driver);
		String x1="C:\\automation\\selenium\\magentoregpage.xlsx";
		String sheet="Sheet1";
		int rowCount = Excelutil.getRowCount(x1, sheet);
		System.out.println(rowCount);
		
		for (int i= 1; i <= rowCount;i++)
		   {
			int cellCount = Excelutil.getCellcount(x1, sheet, i);
			System.out.println("Cell Count: "+cellCount);
			
			for (int j = 0; j< cellCount; j += 5) { 
				String firstname = Excelutil.getCellValue(x1, sheet, i, j);
				System.out.println("FNAME = " + firstname);
				
			    String lastname = Excelutil.getCellValue(x1, sheet, i, j + 1);
				System.out.println("LNAME = " + lastname);
				
				String email = Excelutil.getCellValue(x1, sheet, i, j + 2);
				System.out.println("EMAIL = " + email);
				
				 String password = Excelutil.getCellValue(x1, sheet, i, j + 3);
				System.out.println("Password = " + password);
				
				 String cnfrmpassword = Excelutil.getCellValue(x1, sheet, i, j + 4);
				System.out.println("CPassword = " + cnfrmpassword);
			
		        Thread.sleep(2000);
				log.register();
				log.setValues(email,lastname,email,password,cnfrmpassword);
				log.create();
			}
		   }
	}
}
		
	
		




	
		


