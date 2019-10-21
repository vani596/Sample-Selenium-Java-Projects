package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.redbus.in");
		Thread.sleep(1000);
		//d.switchTo().alert().accept();
		d.manage().window().maximize();		
		WebElement ele=d.findElement(By.xpath(".//*[@class=\"db text-trans-uc\"]"));
		ele.click();
		System.out.println("value of ele" +ele.getText());
		WebElement ele1=d.findElement(By.xpath("(.//*[@class=\"rb-monthTable first last\"])[1]/tbody[1]/tr[1]/td[3]/button"));
		ele1.click();
		//d.close();
	//	.//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[1]/td[3]/button
		
		
		
	}
}
//*[@id="rb-calendar_return_cal"]/table/tbody/tr[1]/td[3]/button