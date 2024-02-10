package DropodownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoption {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/RANI/Desktop/mydropdown.html");
	
	WebElement dropdown = driver.findElement(By.id("menu"));
	Select sel = new Select(dropdown);
	boolean result = sel.isMultiple();
	System.out.println(result);
	
	//to get all the option on dropdown we need to use getoption mehtod
	List<WebElement> options = sel.getOptions();
	//System.out.println(option); list of webelement not directly print we need to use loop
	
	for (int i=0; i<=options.size(); i++)
	{
		String output = options.get(i).getText();
		System.out.println(output);
	}
	
	
	
	
	
}
}


