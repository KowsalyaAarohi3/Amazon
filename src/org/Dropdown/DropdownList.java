package org.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement drp = driver.findElement(By.id("selenium_commands"));
		Select s = new Select(drp);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0; i<options.size(); i++) {
	
		options.get(i).getAttribute("value");
		
		}
		
		
		
		List<WebElement> allop = s.getAllSelectedOptions();
		
		for(WebElement x1: allop) {
			
			String text1 = x1.getText();
			System.out.println(text1);
			
		}
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		}
		}

			
		

		
		
		
	


