package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
	    
		Thread.sleep(5000);
		
		//Capture name of First Resulting lead &clicking
	    WebElement print=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    String last= print.getText();
	    System.out.println(last);
	    print.click();

        driver.findElement(By.linkText("Delete")).click();
        
        driver.findElement(By.linkText("Find Leads")).click();
        
        driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(last);
        
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        driver.close();
        

	}

}
