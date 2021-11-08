package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		
		driver.findElement
		(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		
		
		driver.findElement
		(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
