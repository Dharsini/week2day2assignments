package Week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		
		// Donload and set the path
		WebDriverManager.chromedriver().setup();
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		// Maximixe the window
		driver.manage().window().maximize();
		
		//Add impilicit wait
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click create account
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//enter the first name
	    driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("Gothai");
	    //enter the surname
	    driver.findElement(By.xpath("//input[@type='text'][@name='lastname']")).sendKeys("Arjunan");
	    //Enter the mobile number
	    driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']")).sendKeys("1234567890");
		//Enter the password
	    driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("Arjunan07");
	    
		// Dropdrown DD/MM/YYYY
	    
	    //DATE
	    
	    //// Step 1: Find the dropdown element (select tag)
	    WebElement elementDropdown = driver.findElement(By.id("day"));
	    //convert that as select class
	    
	    Select select = new Select(elementDropdown);
	    
	    //
	    //choose the value based on option
	    select.selectByValue("5");
	    
	    //MONTH
	    //Find the dropdown element ( select tag
	    WebElement element1 = driver.findElement(By.id("month"));
	    
	    //convert that as select class
	    
	    Select select1 = new Select(element1);
	    
	    //choose the value based on option
	    select1.selectByValue("5");
	    
	    //YEAR
	    WebElement element2 = driver.findElement(By.id("year"));
	    Select select2 = new Select(element2);
	    select2.selectByValue("1969");
	    
	    //Select the radio button "Female"
	    driver.findElement(By.name("sex")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}

}
