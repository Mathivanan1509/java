package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMELogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://acme-test.uipath.com/login");	
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("kumar.testleaf@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("leaf@12");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        System.out.println(driver.getTitle());
        WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		driver.close();
        
	}

}
