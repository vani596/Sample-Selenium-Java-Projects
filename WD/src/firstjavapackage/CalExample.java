package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalExample {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/guest/home/miniBus.do?h=1");
		WebElement ele=driver.findElement(By.name("txtJourneyDate"));
		ele.click();
		List<WebElement> rows=driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				WebElement ele1=driver.findElement(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td["+j+"]"));
				if(ele1.getText().equals("25"))
				{
					ele1.click();
				}
			}
		}
		
		
		
		
		
		
		
	}

}
