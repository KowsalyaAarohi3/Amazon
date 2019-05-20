package org.Windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().window().maximize();
		
		String par = driver.getWindowHandle();
		System.out.println("Parent window Title: "+driver.getTitle() );
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='New User Activation']"));
		btn.click();
		
		Set<String> all = driver.getWindowHandles();
		System.out.println("Child window Title: "+driver.getTitle());
		
		int allsize = all.size();
			System.out.println(allsize);
			
			for(String x: all) {
			if(!x.equals(par)) {	
			WebDriver allwindows = driver.switchTo().window(x);
			
			}
			}
			
		}
		
		
	}


