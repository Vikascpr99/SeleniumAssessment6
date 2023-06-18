package ActionPerform;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobileListunder15000 {
	public void mobileUnder15000(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.className("_1fQZEK").className("_4rR01T"));
		List<WebElement> list1 = driver.findElements(By.className("_1fQZEK").className("_1_WHN1"));
		
		
		for(WebElement mobile_name : list) {
			for (WebElement mobile_price : list1) {
				System.out.println(mobile_name.getText() +"======="+ mobile_price.getText());
			}
		}
				 
		 }
	
//	public void mobileDetails(WebDriver driver) {
//		 List<WebElement> list1 = driver.findElements(By.className("_1fQZEK").className("_30jeq3 _1_WHN1"));
//		 for(WebElement mobile_name : list1){
//		       System.out.println(mobile_name.getText());	 
//		 }	
//	}
}
//.className("_30jeq3 _1_WHN1")---> for price list
//.className("_4rR01T")---> for name list


//_1fQZEK
//_30jeq3 _1_WHN1