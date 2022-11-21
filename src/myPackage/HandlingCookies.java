package myPackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//How to capture Cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Cookies size " + cookies.size());
		
		//how to print cookies name from browser
		for(Cookie i:cookies)
		{
			System.out.println(i.getName() + "   "+ "   " + i.getValue());
		}
		
		//How to add cookies 
		Cookie cookieobj = new Cookie("MyCookie123", "12337416");
		driver.manage().addCookie(cookieobj);
		cookies = driver.manage().getCookies();
		System.out.println("Cookies size after adding " + cookies.size());
		
		for(Cookie i:cookies)
		{
			System.out.println(i.getName() + "   "+ "   " + i.getValue());
		}
		
		//How to delete Cookie by using object or name
		//driver.manage().deleteCookie(cookieobj);
		driver.manage().deleteCookieNamed("MyCookie123");
		cookies = driver.manage().getCookies();
		System.out.println("Cookies size after deleting " + cookies.size());
		for(Cookie i:cookies)
		{
			System.out.println(i.getName() + "   "+ "   " + i.getValue());
		}
		
		//How to delete all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Cookies size after all deleting" + cookies.size());
		
	}

}