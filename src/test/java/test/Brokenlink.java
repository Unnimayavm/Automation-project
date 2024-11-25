package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Baseclass;

public class Brokenlink extends Baseclass {
	
	

	
@Test
	
	public void verify_broken() throws IOException{
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int totallinks=links.size();
		System.out.println(totallinks);
		for(int i=0;i<totallinks;i++) {
			String hrefattval=links.get(i).getAttribute("href");
			System.out.println(hrefattval);
			if(hrefattval==null||hrefattval.isEmpty()) {
				System.out.println("there is no href value");
				continue;
				
			}
			verify(hrefattval);
		}
	}

	private void verify(String hrefattval) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			URL hreflink=new URL(hrefattval);
			HttpURLConnection con=(HttpURLConnection)hreflink.openConnection();
			con.connect();
			
			if (con.getResponseCode()>=400) {
				System.out.println("Brocken link---->" + hreflink);
			}
			else {
				System.out.println("valid link---->"+hreflink);
			}
			
		}catch(Exception e) {
			
		}
	}
}
	
		
	
