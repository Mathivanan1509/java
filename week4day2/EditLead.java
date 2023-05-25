package week4.day3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
        WebElement firstName = driver.findElement(By.id("ext-gen248"));
		firstName.sendKeys("Princy");
		Thread.sleep(3000);
		WebElement findLead1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLead1.click();
		Thread.sleep(4000);
		WebElement firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
	    firstLead.click();
	    WebElement pageTiltle = driver.findElement(By.xpath("//div[contains(text(),'View Lead')]"));
	    String pgTitle = pageTiltle.getText();
	    System.out.println(pgTitle);
	    if(pgTitle.contains("View Lead")) {
	    	System.out.println("title is verified");
	    	
	    }
	    WebElement editButton = driver.findElement(By.linkText("Edit"));
	    editButton.click();
	    WebElement companyName = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
	    companyName.clear();
	    companyName.sendKeys("CNAMECHANEGED");
	    WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
	    update.click();
	    WebElement companyName1 = driver.findElement(By.id("viewLead_companyName_sp"));
	    String cname1=companyName1.getText();
	    System.out.println(cname1);
	    if(cname1.contains("CNAMECHANEGED")) {
	    	System.out.println("companyname changed");
	    }
	    driver.quit();
	}
}
