package ActionPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class FilterPrice {

	public void filterName(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")).click();
		
	}
	public void selectRange(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[4]")).click();
	}
	
	public void selectAndroidVersion(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[21]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[21]/div[2]/div[2]/span")).click();
		Thread.sleep(3000);
		WebElement android_version = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[21]/div[2]/div[1]/div[15]/div/label/div[1]"));
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", android_version);
		android_version.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[5]")).click();
	}
	
}
