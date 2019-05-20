package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement sigin = driver.findElement(By.id("signin-block"));
		sigin.click();
		
		Thread.sleep(2000);
		
		WebElement sigin2 = driver.findElement(By.id("signInLink"));
		sigin2.click();
		
		Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.id("not_signed_in3ops02ifdlu5"));
		frame2.click();
	}

}
