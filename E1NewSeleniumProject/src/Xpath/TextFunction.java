package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-j0c1is5e/login.do");
	Thread.sleep(1000);
	
	WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
	loginButton.click();
	
	
	//or by using dot(.) 
	//WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
	//loginButton.click();
	
	
}
}
