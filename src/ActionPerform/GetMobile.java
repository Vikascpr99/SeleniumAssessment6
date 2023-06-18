package ActionPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetMobile {

	public void getMobile(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		
		for(String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		WebElement mobile_price = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div"));
		System.out.println("Mobile Price to verify :- "+ mobile_price.getText());
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	}
}
