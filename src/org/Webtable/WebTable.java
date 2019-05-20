package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		for(int i=0; i<trow.size(); i++) {
		List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
		for(int j=0; j<tdata.size(); j++) {
		String text = tdata.get(j).getText();
		System.out.println(text);
		
			
			
		}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
