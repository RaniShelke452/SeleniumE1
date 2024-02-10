package actionclassmethid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		
		//to hold the value
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		WebElement clickandhold = driver.findElement(By.id("circle"));
		 
		act.clickAndHold(clickandhold).perform();
		Thread.sleep(4000);
		
		
        // to realse value
		act.release(clickandhold).perform();
	}

}
