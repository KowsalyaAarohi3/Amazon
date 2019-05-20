package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lasttworows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Kowsalya\\JavaPractice\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.get(3).getText());
		System.out.println(rows.get(4).getText());
/*		String text = rows.get(5).getText();
 * 
		String text2 = rows.get(2).getText();
		System.out.println(text);
		System.out.println(text2);*/
		// for (WebElement x : rows) {
		// String text = x.getText();
		// System.out.print(text);
		// }
		// System.out.println(rows.get(5).getText());
		// System.out.println(rows.get(6).getText());
		/*
		 * for(int i=0; i<rows.size(); i++) {
		 * 
		 * List<WebElement> datas = driver.findElements(By.tagName("td")); for(int j=0;
		 * j<rows.size(); j++) { String text =datas.get(j).getText();
		 * 
		 * if(text.equals("China")) { System.out.println(text);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

	}

}
