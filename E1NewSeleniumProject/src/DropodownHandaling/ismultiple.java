package DropodownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/RANI/Desktop/mydropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		boolean result = sel.isMultiple();
		System.out.println(result);
		
		
	}

}
