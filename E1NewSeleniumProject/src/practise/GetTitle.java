package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	
	//to autmate the insta
	
	//WebElement usName = driver.findElement(By.name("username"));
	//usName.sendKeys("rani_shelke");
	WebElement usname = driver.findElement(By.xpath("//input[@name='username']"));
	usname.sendKeys("karan");
    Thread.sleep(1000);
    
    WebElement pas = driver.findElement(By.xpath("//input[@aria-label='Password']"));
    pas.sendKeys("123");
	
     //WebElement passName = driver.findElement(By.name("password"));
	//passName.sendKeys("rani@45");
	
	//WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
	//btn.click();
    
    WebElement btno = driver.findElement(By.xpath("//button[@type='submit']"));
    btno.click();
	
	
	  
	
	// this process Aalso used in xpat
	//attribute by unieqe
	
	
	
	  
	
	
	
	
}
}
