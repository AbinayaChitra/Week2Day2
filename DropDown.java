package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) 
	
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
		
		//CREATING CONTACT
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("CHRIS");
		driver.findElement(By.id("lastNameField")).sendKeys("HEMSWORTH");
		
		//dropdown for visible text
		WebElement dropone = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		
		Select select = new Select(dropone);
		select.selectByVisibleText("INR - Indian Rupee");
		
		//dropdown for value
		WebElement droptwo = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		
		Select select2= new Select(droptwo);
		
		select2.selectByValue("IND");
		
        driver.findElement(By.name("submitButton")).click();
        driver.close();
        		

		
		

	}

}
