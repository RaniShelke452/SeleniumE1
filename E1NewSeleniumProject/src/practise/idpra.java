package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idpra {
public static void main(String[] args) {
	 WebDriver driver  = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://practicetestautomation.com/practice-test-login/");
	WebElement usName = driver.findElement(By.id("username"));
	usName.sendKeys("rani");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("pas12");
	
	WebElement button = driver.findElement(By.className("btn"));
	button.click();
	
	
	
}

}

