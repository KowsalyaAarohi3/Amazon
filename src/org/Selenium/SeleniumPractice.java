package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		WebElement ref = driver.findElement(By.xpath("//div[text()='Got a Question?']"));
		WebElement ref1 = driver.findElement(By.xpath("//span[text()='HOME']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoview(true)", ref);
		j.executeScript("arguments[1].scrollIntoview(false)", ref1);
		
	}
}
