package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
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
		driver.findElement(By.id("lastNameField")).sendKeys("SMITH");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("MECHANICAL");
		driver.findElement(By.id("createContactForm_description")).sendKeys("NO COMMENTS");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("frozen3495@gmail.com");
        
		// enter a state
        WebElement STATE = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(STATE);
		select.selectByValue("NY");
		
		driver.findElement(By.name("submitButton")).click();

		//Edit button
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("NO COMMENTS");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//get title
		String text=driver.getTitle();
        System.out.println(text);
        
        driver.close();
		

	}

}
