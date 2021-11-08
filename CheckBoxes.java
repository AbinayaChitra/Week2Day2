package week2.day2;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		// to find all checkboxes in page
		 List<WebElement> allchk = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 System.out.println(allchk.size());
		// click on first checkbox
		 allchk.get(2).click();
		 
		//click last checkbox 
		 
		 int last= allchk.size();
		allchk.get(last-1).click();
		//driver.close();
	}


}
