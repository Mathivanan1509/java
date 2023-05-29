package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTilte {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		String pagetitle = driver.getTitle();
		System.out.println("pagetitle="+pagetitle);
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		logOut.click();
		driver.close();

	}


}
