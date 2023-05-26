package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		WebElement firstName= driver.findElement(By.name("firstname"));
		firstName.sendKeys("MATHIVANAN");
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys("mathivanan@gamil.com");
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("glad@4024");
		WebElement birthday= driver.findElement(By.name("birthday_day"));
		Select day=new Select(birthday);
		day.selectByVisibleText("15");
		WebElement birthMonth= driver.findElement(By.name("birthday_month"));
		Select month=new Select(birthMonth);
		month.selectByVisibleText("Sep");
		WebElement birthYear= driver.findElement(By.name("birthday_year"));
		Select year=new Select(birthYear);
		year.selectByVisibleText("2001");
		WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		driver.close();
		
	}

}
