package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintParticular {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.xpath("(//tr[@class='odd'])[2]"));
		
		for(int r=0; r<trows.size(); r++) {
			List<WebElement> tdatas=trows.get(r).findElements(By.tagName("th"));
			for(int t=0; t<tdatas.size(); t++) {
			String text = tdatas.get(t).getText();	
			System.out.println(text);
				
			}
			for(int r1=0; r1<trows.size(); r1++) {
				List<WebElement> tdatas1=trows.get(r).findElements(By.tagName("td"));
				for(int t1=0; t1<tdatas1.size(); t1++) {
				String text1 = tdatas1.get(t1).getText();	
				System.out.println(text1);
					
				}
			
			
		}
			
		}
		}
		
	}
