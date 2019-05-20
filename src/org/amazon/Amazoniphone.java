package org.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazoniphone {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("iphone");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
//		Set<String> allwindows = driver.getWindowHandles();
	
		Thread.sleep(2000);
		
		for(int i=1; i<=3; i++) {
				WebElement phne = driver.findElement(By.className("s-image"));
				phne.click();
		}
		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String str : allwindows) {
			if(!str.equals(parent)) {
				driver.switchTo().window(str);
				WebElement cart = driver.findElement(By.className("a-button-input"));
				cart.click();
			}
		}
//		int count=0;
//		List<WebElement> iphnoe = driver.findElements(By.className("a-link-normal a-text-normal"));
//		for (int i = 0; i < 10; i++) {
//			WebElement phnoe = iphnoe.get(i);
//			phnoe.click();
//			String par = driver.getWindowHandle();
//			Set<String> chi = driver.getWindowHandles();	
//			if(count==i) {
//				for (String x : chi) {
//					driver.switchTo().window(x);
//					WebElement cart = driver.findElement(By.className("a-button-input"));
//				cart.click();
//				count++;
//				
//				}
//				driver.switchTo().window(par);
//				
			}
			
		
		}
		
		
	


