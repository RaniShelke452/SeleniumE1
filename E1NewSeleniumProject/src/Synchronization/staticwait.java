package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwait {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//to apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//to launch web application
	driver.get("https://www.instagram.com/accounts/login/");
	
	driver.findElement(By.name("username")).sendKeys("rani");
		
	}

}
