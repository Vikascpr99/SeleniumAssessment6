package ActionPerform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EnterDetails extends BrowserSetting{

	public void enterKeyword(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");
			
	}
	public void suggestion(WebDriver driver) {
	
		WebElement autoOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul"));
		 List<WebElement> optionsToSelect = driver.findElements(By.tagName("li"));

		    for(WebElement option : optionsToSelect){
		       // System.out.println(option);
		        String textToSelect ="mobiles under 15000";
				if(option.getText().equals(textToSelect)) {
//		            System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
				}
		    }
		
	}

	
	
}
