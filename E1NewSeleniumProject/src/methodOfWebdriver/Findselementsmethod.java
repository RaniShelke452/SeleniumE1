package methodOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findselementsmethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	
	WebElement activeEle = driver.switchTo().activeElement();
	activeEle.sendKeys("bikes");
	Thread.sleep(1000);
	
	List<WebElement> bikesOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	
	for(WebElement we:bikesOptions) {
		String option = we.getText();
		Thread.sleep(1000);
	
	}
	
	
	
	
	
}
}
