package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
	    WebElement print=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
	    String last= print.getText();
	    System.out.println(last);
	    print.click();
	    //click duplicate lead
		
        driver.findElement(By.linkText("Duplicate Lead")).click();
        
        String text1=driver.getTitle();
        System.out.println(text1);
        
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
        driver.close();

	}

}
