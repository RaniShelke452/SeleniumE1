package DropodownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectmethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/RANI/Desktop/mydropdown.html");
	
	
	//to handle static dropdown we need to create object first find drodown then the create an object
	WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		//this method is used to diselect vale by using deselectbyindex
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		
		
		//this method is used to diselect the value by used deselectbyvalue
		sel.selectByValue("v7");
		Thread.sleep(2000);
		sel.deselectByValue("v7");
		
		
		//this method is used to diselect the value by used deselectbyvisibletext
		sel.selectByValue("v5");
		Thread.sleep(2000);
		sel.deselectByVisibleText("poha");
		
	}

}
