package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement profile= driver.findElement(By.id("REGISTERED_BY"));
		Select profile1=new Select(profile);
		profile1.selectByVisibleText("Myself");
		WebElement name= driver.findElement(By.name("NAME"));
		name.sendKeys("MATHIVANAN S");
		WebElement gender= driver.findElement(By.xpath("//input[@id='gendermale']"));
		gender.click();
		WebElement birthday= driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select day=new Select(birthday);
		day.selectByVisibleText("15");
		WebElement birthMonth= driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select month=new Select(birthMonth);
		month.selectByVisibleText("Sep");
		WebElement birthYear= driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select year=new Select(birthYear);
		year.selectByVisibleText("2001");
		WebElement relegion= driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select relegion1=new Select(relegion);
		relegion1.selectByVisibleText("Hindu");
		WebElement motherTongue= driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select moTongue=new Select(motherTongue);
		moTongue.selectByVisibleText("Tamil");
		WebElement country= driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement phoneNumber= driver.findElement(By.xpath("//input[@value='Mobile Number']"));
		phoneNumber.sendKeys("9150710232");
		WebElement email= driver.findElement(By.xpath("//input[@id='EMAIL']"));
		email.sendKeys("mathi@gmail.com");
		driver.close();
		System.out.println("sgvfv");
	}
}
