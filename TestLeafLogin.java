package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafLogin {

	public static void main(String[] args) {
		
		// Donload and set the path
				WebDriverManager.chromedriver().setup();
				System.out.println(System.getProperty("webdriver.chrome.driver"));
				
				//Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
				
				//1. Launch URL "http://leaftaps.com/opentaps/control/login"
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//* 2. Enter UserName and Password Using Id Locator
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// * 3. Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//* 4. Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//* 5. Click on contacts Button
				driver.findElement(By.linkText("Contacts")).click();
				
				//* 6. Click on Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				
				//* 7. Enter FirstName Field Using id Locator
				driver.findElement(By.id("firstNameField")).sendKeys("Archana");
				
				//* 8. Enter LastName Field Using id Locator
				driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
				
				//* 9. Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Archana");
				
				//* 10. Enter LastName(Local) Field Using id Locator
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
				
				//* 11. Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
				
				//* 12. Enter Description Field Using any Locator of your choice 
				driver.findElement(By.name("description")).sendKeys("Quality Assurance Team");
				
				//* 13. Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dharsinieee@gmail.com");
				
				//* 14. Select State/Province as NewYork Using Visible Text
				WebElement ele1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select obj = new Select(ele1);
				obj.selectByValue("NY");
				
				// * 15. Click on Create Contact
				driver.findElement(By.name("submitButton")).click();
				
				//* 16. Click on edit button
				driver.findElement(By.linkText("Edit")).click();
				
				//* 17. Clear the Description Field using .clear
				driver.findElement(By.name("description")).clear();
				
				//* 18. Fill ImportantNote Field with Any text
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("this contact is edited");
				
				// * 19. Click on update button using Xpath locator
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				// 20.Get the title
				String title = driver.getTitle();
				System.out.println(title);
				
				
				
				
				
				
				
		

	}

}
