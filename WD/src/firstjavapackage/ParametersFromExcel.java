package firstjavapackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParametersFromExcel {
	public static void main(String[] args) throws Exception{
		
		XSSFWorkbook wb=new XSSFWorkbook("TestData.xlsx");
		XSSFSheet sh=wb.getSheet("Data");
		int rowCount=sh.getPhysicalNumberOfRows();
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		for(int i=1;i<rowCount;i++) {
			
			String searchValue=sh.getRow(i).getCell(0).getStringCellValue();
			String dropDown=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(searchValue);
			System.out.println(dropDown);
			//selenium code
			
			
			WebElement ele1=driver.findElement(By.id("gh-ac"));
			WebElement ele2=driver.findElement(By.id("gh-cat"));
			WebElement ele3=driver.findElement(By.id("gh-btn"));
			ele1.sendKeys(searchValue);
			Select sel=new Select(ele2);
			sel.selectByVisibleText(dropDown);
			ele3.click();
			driver.navigate().back();
			Thread.sleep(5000);			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
