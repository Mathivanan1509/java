package week4.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
        leadButton.click();
        WebElement findlead = driver.findElement(By.linkText("Find Leads"));
        findlead.click();
        WebElement email = driver.findElement(By.linkText("Email"));
        email.click();
        WebElement emailId = driver.findElement(By.name("emailAddress"));
		emailId.sendKeys("jprincy0623@gmail.com");	
		WebElement findLead1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLead1.click();
		Thread.sleep(3000);
		WebElement firstLead = driver.findElement(By.xpath("//a[text()='Princy']"));
		String flead =firstLead.getText();
	    firstLead.click();
	    System.out.println(flead);
	    WebElement duplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
	    duplicateLead.click();
	    WebElement dupTitle=driver.findElement(By.xpath("//div[text()='Duplicate Lead']"));
	    String dtitle=dupTitle.getText();
	    System.out.println(dtitle);
	    if(dtitle.equals("Duplicate Lead")) {
	    	System.out.println(dtitle+" the tile is verified");
	    }
	    WebElement createLead = driver.findElement(By.xpath("//input[@value='Create Lead']"));
	    createLead.click();
	    WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
        String text1 = dName.getText();
        System.out.println(text1);
        if(text1.equals(flead)) {
        	System.out.println("both are same");
        }
		System.out.println("nill");
		driver.close();
	}

}
