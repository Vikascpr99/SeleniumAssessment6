package ActionPerform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.log4j.BasicConfigurator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WritePhoneList{
public void output(WebDriver driver) throws IOException, InterruptedException{
	System.out.println("Below are the top 5 latest phones under 15000 for you : ");
List<WebElement> names_list= driver.findElements(By.className("_4rR01T"));
Thread.sleep(2000);
List<WebElement> phones_list= driver.findElements(By.className("_1_WHN1"));Map<Integer, Object[]> newval=new TreeMap<Integer, Object[]>();
int i=0;for (WebElement phone : names_list) {
if(i<=4) {
newval.put(i, new Object[] {phone.getText()});}i++;
}
int j=0;for (WebElement phone : phones_list) {
if(j<=4) {
newval.put(j, new Object[] {phone.getText()});}j++;}
BasicConfigurator.configure();
File f= new File("C:\\Users\\VK65778\\Downloads\\MobileList.xlsx");
FileInputStream fis=new FileInputStream(f);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);for(int j1=0;j1<phones_list.size();j1++)
{
Row row2 = sheet.createRow(j1+1);
if (j1 < 5) {
row2.createCell(0).setCellValue(names_list.get(j1).getText());
row2.createCell(1).setCellValue(phones_list.get(j1).getText());
}
}try {
FileOutputStream os = new FileOutputStream(new File("C:\\Users\\VK65778\\Downloads\\MobileList.xlsx"));
wb.write(os);
os.close();
System.out.println("NAME ADDED!!!");
}
catch(Exception e) {
e.printStackTrace();
}}
}

