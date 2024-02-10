package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expliciwait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//to apply implicity wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	
	//to apply explicit wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.shoppersstack.com/");
	
	driver.findElement(By.xpath("//span[text()='APPLE']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	
	//1st way to use explicit wait or waiting condition
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@name='Check']"))));
	//driver.findElement(By.xpath("//button[@name='Check']")).click();
	
	
	//2nd way to use explicit wait
	WebElement checkButton = driver.findElement(By.xpath("//button[@name='Check']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkButton));
	checkButton.click();
	
	
}
}