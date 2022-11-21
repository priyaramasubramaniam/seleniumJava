package myPackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {
	public static void main(String[] args){
		
		//Chrome
		String location = "/SeleniumJava/Downloads";
		
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		
		//Edge
//		String location = System.getProperty("user.dire") + "//Downloads//";
//
//		HashMap preferences = new HashMap();
//		preferences.put("download.default_directory", location);
//		
//		EdgeOptions options = new EdgeOptions();
//		options.setExperimentalOption("prefs", preferences);
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver(options);
		
		//Firefox 
		
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword"); //mimi type
//		profile.setPreference("browser.download.folderList", 0); 	//0 for desktop, 1 for download folder, 3 for desired location
		
		
		
		
		driver.get("https://fastest.fish/test-files");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='1MB']")).click();
		
		
		//driver.close();
	}
}