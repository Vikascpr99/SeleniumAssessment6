package ActionPerform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WriteData {
public void ExcelWrite(WebDriver driver) throws IOException, InterruptedException {

XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet("Mobiles");

List<WebElement> list = driver.findElements(By.className("_1fQZEK").className("_4rR01T"));
Thread.sleep(3000);

for(WebElement options:list) {
	
		
	

String am=options.getText();

sheet.createRow(0);
sheet.getRow(0).createCell(0).setCellValue(am);




File file=new File("C:\\Users\\VK65778\\Downloads\\Book 7.xlsx");
FileOutputStream fos=new FileOutputStream(file);
workbook.write(fos);



workbook.close();
}





}
}