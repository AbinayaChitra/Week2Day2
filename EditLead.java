package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//LOGIN ACCOUNT 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		//Click Leads
	    driver.findElement(By.linkText("Leads")).click();
	    
	    driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("CHRIS");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String text1=driver.getTitle();
        System.out.println(text1);
        driver.findElement(By.linkText("Edit")).click();
        
		WebElement replace=driver.findElement(By.id("updateLeadForm_companyName"));
		replace.clear();
		replace.sendKeys("MICROSOFT");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
        
		driver.close();
		
	

		


	}

}
