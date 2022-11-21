package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//Get Title by using JavascriptExecutor
		/*String title = JavaScriptUtil.getTitleByJs(driver);
		System.out.println(title);*/
	
		
		//Click Action by JS
		/*WebElement Reglink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.clickElementByJs(driver, Reglink);*/
		
		
		//Generate Alert by JS
		/*JavaScriptUtil.generateAlert(driver, "This is my Alert");*/
		
		//Refresh Page by JS
		/*JavaScriptUtil.refreshPageByJs(driver);*/
		
		//Draw Border
		WebElement image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawBorder(driver, image);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//Screenshots//logo.png");
		FileUtils.copyFile(src, trg);
		
		//ScrollDown by Js
		/* JavaScriptUtil.scrollPageDown(driver);
		Thread.sleep(2000); */
		
		//ScrollUp by JS
		/*JavaScriptUtil.scrollPageUp(driver);*/
		
		//Zoom Page by JS
		/*JavaScriptUtil.zoomPageByJs(driver);*/
		
		//Flash
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flash(driver, image1);
		
		driver.quit();
	}

}
 