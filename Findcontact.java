package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findcontact {

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
		
		//Find Contact
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		//both are correct to type and click first name
		//driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("CHRIS");
		
		driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name='firstName']")).sendKeys("CHRIS");
		//"label[text()='Contact Id:']/following::input[@name='firstName']
		//finding contacts 
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        Thread.sleep(5000);
        
        //clicking on first match
        
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

}
