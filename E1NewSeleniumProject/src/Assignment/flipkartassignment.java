package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartassignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("HP laptop");
	
	WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
	btn.click();
	
	WebElement bClick = driver.findElement(By.xpath("//div[text()='Brand']"));
	bClick.click();
	
   WebElement selCheckbox = driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']"));
   selCheckbox.click();
   Thread.sleep(1000);
   
   WebElement sel = driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div[@class='_24_Dny']"));
   sel.click();
   
   
	

}
}
