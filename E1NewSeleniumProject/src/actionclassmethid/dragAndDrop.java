package actionclassmethid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	//Action class
	Actions act = new Actions(driver);
	
	//just clicking for button
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	
	//to perform drag drop operation for mobile
	WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement mobileAcessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	act.dragAndDrop(mobileCharger,mobileAcessories ).perform();
	act.dragAndDrop(mobilecover, mobileAcessories).perform();
	
	//to perform drag drop operation for laptop
	
	WebElement laptopcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
    WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
    act.dragAndDrop(laptopcharger, laptopAccessories).perform();
    act.dragAndDrop(laptopcover, laptopAccessories).perform();
	
}



}
