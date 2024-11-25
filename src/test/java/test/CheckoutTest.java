package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.Checkout;
import page.login;
import page.product;
import util.Excelutil;

public class CheckoutTest  extends Baseclass{
	
     @Test
		public void checkout() throws InterruptedException {
			login p1 =new login(driver);
			        p1.signinclick();
				    Thread.sleep(2000);
				    p1.setValues("bivinkk@gmail.com", "BIVINkk1234");//direct value send so no loop added here
				    p1.buttonclick();
				    Thread.sleep(1000);
			
				    product pdt=new product(driver);
				    pdt.women();
				    pdt.tops();
				    pdt.breath();
				    pdt.size();
				    pdt.colour();
				    pdt.addtocart();
				    Thread.sleep(2000);
				    
				    Checkout pdt1=new Checkout(driver);
				    pdt1.cartclick();
				    pdt1.checkoutclick();
				   // pdt1.setValues( "anu","ck","wipro","kj nagar", "manadavadi", "635678", "9086788756");
				    //pdt1.stateclick();
				    //pdt1.countryclick();
				    pdt1.shippingclick();
				   
				  //  pdt1.nextclick();
				    pdt1.placeorderclick();
				    pdt1.countinueshoppingclick();
				    pdt1.logoutclick();
				    
     }
     
     
		          
     }


				   
			




