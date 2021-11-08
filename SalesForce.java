package week2.dayy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(50 ,TimeUnit.SECONDS);
		
		//entering values
		driver.findElement(By.name("UserFirstName")).sendKeys("sand");
		driver.findElement(By.name("UserLastName")).sendKeys("fire345678233");
		driver.findElement(By.name("UserEmail")).sendKeys("frozen3495@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Amazon");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		//drop down
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select select=new Select(jobtitle);
		select.selectByVisibleText("Sales Manager");
		
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
        Select select2=new Select(country);
        select2.selectByValue("FI");
        
        
       
        
        WebElement employee = driver.findElement(By.name("CompanyEmployees"));
        Select select3=new Select(employee);
        select3.selectByValue("950");
        //used to slow little before selecting checkboxes
        Thread.sleep(5000);
        
        //using elder to younger relationship xpath
        List<WebElement> allchk = driver.findElements(By.xpath("//input[@class='sr-only']/following-sibling::div"));
        allchk.get(0).click();
        
        
        allchk.get(2).click();
        driver.close();
        
       
		
	}

}
