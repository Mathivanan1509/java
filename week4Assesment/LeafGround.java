package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml;jsessionid=node01va1em1f6yain15sjfb5snxq2y271405.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement clickT = driver.findElement(By.xpath("//span[text()='Click']"));
		clickT.click();
		WebElement title = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']"));
		String title1=title.getText();
		System.out.println(title1);
		if(title1.contains("Dashboard")) {
			System.out.println("The title has verified");
		}
		WebElement clickMenu = driver.findElement(By.xpath("//li[@class='ui-menuitem-submenu'][3]"));
		clickMenu.click();
		
	}

}
