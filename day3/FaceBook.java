package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement CreateNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNewAccount.click();
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("MATHIVANAN");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");
		WebElement mobNo = driver.findElement(By.name("reg_email__"));
		mobNo.sendKeys("9140710232");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("glad@4024");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select day15=new Select(day);
		day15.selectByVisibleText("15");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month8=new Select(month);
		month8.selectByVisibleText("Sep");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2001");
	    WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		
		
	}
}
