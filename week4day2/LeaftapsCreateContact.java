package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsCreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();
		WebElement contact = driver.findElement(By.linkText("Contacts"));
		contact.click();
		WebElement newContact = driver.findElement(By.linkText("Create Contact"));
		newContact.click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("MATHIVANAN");
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("S");
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("MATHIVANAN");
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("S");
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("CSE");
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("NILL");
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("mathi@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("California");
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		WebElement description1 = driver.findElement(By.id("updateContactForm_description"));
		description1.clear();
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("NILL");
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
