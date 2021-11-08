package week2.dayy1;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Create account
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sand");
		driver.findElement(By.name("lastname")).sendKeys("fire345678233");
		driver.findElement(By.name("reg_email__")).sendKeys("frozen3495@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Godbless@67");
		// Drop down for days
		WebElement days = driver.findElement(By.id("day"));
		Select select = new Select(days);
		select.selectByValue("30");
		
		// Drop down for months
		WebElement months = driver.findElement(By.id("month"));
		Select select2=new Select(months);
		select2.selectByValue("9");
		
		// Drop down for years
		WebElement years = driver.findElement(By.id("year"));
		Select select3=new Select(years);
		select3.selectByValue("1972");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("frozen3495@gmail.com");
		
		driver.findElement(By.name("websubmit")).click();

	}

}
