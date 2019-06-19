package com.app.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	
	public BasePage() {
		if (driver==null){
			if(browser.equals("chrome"))
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	public boolean elementDisplayed(WebElement element) {
		boolean result = false;
		try {
			result=element.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}return result;
	}
	
	public void sendText(WebElement element, String name) {
		element.sendKeys(name);
		element.sendKeys(Keys.ENTER);
	}
	

		
	}
		
	


