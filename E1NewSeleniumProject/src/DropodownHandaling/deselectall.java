package DropodownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectall {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/RANI/Desktop/mydropdown.html");
	
	WebElement dropdown = driver.findElement(By.id("menu"));
	Select sel = new Select(dropdown);
	
	
	
	//we have use loop for select all webelement in dopdown
	for(int i=0;i<=6;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(2000);
	}
	//we deselct all the selected value by 2way first way using loop or deselectAll mthod
	
	//loop method
	//for(int j=0; j<=6;j++) 
	//{
		//sel.deselectByIndex(j);
		//Thread.sleep(2000);
		
	//}
	
	//deselectall method
	sel.deselectAll();
	
}
}
