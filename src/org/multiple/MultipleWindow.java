package org.multiple;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\lib1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	WebElement can = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	can.click();
	WebElement ser = driver.findElement(By.xpath("//input[@type='text']"));
	ser.sendKeys("iphone");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	WebElement phne = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
	phne.click();
	Thread.sleep(2000);
	
   String par = driver.getWindowHandle();
   System.out.println(par);
  //all windows
   Set<String> child = driver.getWindowHandles();
   
   System.out.println(child);
  for (String x : child) {
	  
	  if(!par.equals(child)) {
		   
		   driver.switchTo().window(x);
	  
	
}
  }
  WebElement add = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
  add.click();
}
   
    }
   

