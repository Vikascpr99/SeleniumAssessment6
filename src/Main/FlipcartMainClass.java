package Main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ActionPerform.*;


public class FlipcartMainClass {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserSetting bs = new  BrowserSetting();
		driver =bs.driverSettings();
		driver.get("https://www.flipkart.com/");
		EnterDetails ed = new EnterDetails();
		ed.enterKeyword(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul/li[7]/div")));
		ed.suggestion(driver);		
		MobileListunder15000 ml = new MobileListunder15000();
		ml.mobileUnder15000(driver);
		
		
		Thread.sleep(3000);
		FilterPrice fp = new FilterPrice();
		fp.filterName(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[4]")));
		fp.selectRange(driver);
		Thread.sleep(3000);
		fp.selectAndroidVersion(driver);
		Thread.sleep(10000);
		WritePhoneList wpl = new WritePhoneList();
		wpl.output(driver);
		GetMobile gm = new GetMobile();
		gm.getMobile(driver);
		
		CloseBrowser cb = new CloseBrowser();
		cb.closeBrowser(driver);

	
		
		Thread.sleep(3000);
		driver.quit();
	}

}
