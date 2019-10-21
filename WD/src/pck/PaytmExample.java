package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Program to  open Paytm, click on login/signup then close the popup

public class PaytmExample {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath(".//*[@class=\"_3ac-\"]"));
		ele.click();
		WebElement ele1=driver.findElement(By.xpath(".//*[@class=\"_3i6R\"]"));
		Thread.sleep(1000);
		ele1.click();
		driver.close();		
	}
}
