package CBPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBCount {
	static List<WebElement> list2 = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		d.findElement(By.className("nav-input")).click();
		Thread.sleep(5000);
		
//		list2 = d.findElements(By.cssSelector("i.a-icon.a-icon-checkbox"));
		list2 = d.findElements(By.className("a-icon-checkbox"));
		
		System.out.println(list2.size());
		
		
		
		
		
		
		/*
		 * List<WebElement> list1= d.findElements(By.
		 * xpath("//ul[contains(@aria-labelledby,'p_89')]//div[contains(@class,' a-checkbox-fancy')]"
		 * )); System.out.println(list1.size());
		 */
		// for(WebElement checkBox:list1) {
		/*
		 * list2= d.findElements(By.xpath(
		 * "//ul[contains(@aria-labelledby,'p_89')]//span[contains(@class,'a-size')]"));
		 * 
		 * for(WebElement checkBox:list2) { String s = checkBox.getText();
		 * System.out.println(s); }
		 * 
		 * list2= d.findElements(By.xpath(
		 * "//ul[contains(@aria-labelledby,'p_n_feature_three')]//span[contains(@class,'a-size')]"
		 * ));
		 * 
		 * 
		 * int a = list2.size();
		 * 
		 * for(int i=0; i<a;i++) { String e = list2.get(i).getText();
		 * System.out.println(e); }
		 * 
		 * 
		 * 
		 * for(WebElement checkBox:list2) { String s = checkBox.getText();
		 * System.out.println(s); }
		 */

		// }
		d.close();

		/*
		 * System.out.println("Entered text Oneplus"); //List<WebElement>
		 * li=d.findElements(By.className("a-checkbox-fancy")); List<WebElement>
		 * li=d.findElements(By.id("brandsRefinements")); int counter=0;
		 * System.out.println(li.size()); for (int i=0; i<li.size();i++) {
		 * //if(!li.get(i).getText().equals(" ")) { //counter=counter+1;
		 * List<WebElement> list1 = null ; for(WebElement checkBox:li) { list1 =
		 * checkBox.findElements(By.xpath("//li")); } System.out.println(list1.size());
		 * //System.out.println(li.get(i).getAttribute("class")); d.close();
		 * //System.out.println(li.get(i)); //} //System.out.println(counter); }
		 */
	}
}
