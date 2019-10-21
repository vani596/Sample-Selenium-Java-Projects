import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class testAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("hoi");
	
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\prashat\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    WebDriver driver = new ChromeDriver();
		/*
		 * FirefoxBinary firefoxBinary = new FirefoxBinary(); FirefoxOptions
		 * firefoxOptions = new FirefoxOptions();
		 * firefoxOptions.setBinary(firefoxBinary);
		 * //firefoxBinary.addCommandLineOptions("--headless"); //
		 * firefoxOptions.addArguments("--window-size=1920,1080");
		 */   
	//WebDriver driver = new FirefoxDriver();
     driver.get("www.google.com");
    // driver.manage().window().maximize();
	//driver.quit();
	
	// Thread.sleep(15000);

     //locators
     //driver.findElement(By.xpath(".//a[(@id='loginText')]")).click();
     //Thread.sleep(5000);

    // driver.findElement(By.xpath(".//input[@id='userId']")).sendKeys("tetser");
     //driver.findElement(By.xpath(".//input[@id='pwd']")).sendKeys("tetser");
   //  driver.findElement(By.xpath(".//input[(@id='nlpAnswer')]")).sendKeys("Invesco");
     //driver.findElement(By.xpath(".//button[text()='SIGN IN']")).click();
    // Thread.sleep(5000);
    // String actulText = driver.findElement(By.xpath(".//div[contains(@class,'loginError')]")).getText();
    // String expectedText = "Please Enter Valid Captcha";
    // if(actulText.equals(expectedText)){
    //     System.out.println("________PASS_____");
    // }else{
        // System.out.println("________FAILED BECAUSE expected text is "+expectedText+" ACTUAL TEXT IS_____"+actulText+"" );
    // }
	
	}

}
