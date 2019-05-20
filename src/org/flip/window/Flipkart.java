package org.flip.window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
//	WebElement can = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
//	can.click();
//	
//	Thread.sleep(2000);
//	WebElement srch = driver.findElement(By.xpath("//input[@type='text']"));
//	srch.sendKeys("iphone");
//	
//	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//
//	String par = driver.getWindowHandle();
//	System.out.println(par);
//	
//	for(int i=1; i<=5; i++) {
//		Set<String> child = driver.getWindowHandles();
//		List<WebElement> childs = driver.findElements(By.className("_3wU53n"));
//		childs.get(i);
//		
//		  if(!par.equals(child)) {
//			  
//			  for(String x:child) {
//				 driver.switchTo().window(x); 
//				  
//			  }
//		  }
//			   
//			  
//		  WebElement add = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
//		  add.click();
//		
//	}
//	
//	
	}
	
	
	
}
