package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
	

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for(WebElement rows:trows) {
		List<WebElement> tdata = driver.findElements(By.tagName("td"));	
		for(WebElement data:tdata) {
			
			String text2 = data.getText();
			System.out.println(text2);
			
			
		}
			
		}
		}
		
		
}
