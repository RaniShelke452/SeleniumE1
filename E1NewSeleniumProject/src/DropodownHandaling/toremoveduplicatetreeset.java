package DropodownHandaling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toremoveduplicatetreeset {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/RANI/Desktop/Dropdown/Myhtmlcode.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);//to create object
		
		//to remove duplicate used treeset
		TreeSet<String> ts = new TreeSet<String>();// to create thhe object of treeset
		 
		
		List<WebElement> option = sel.getOptions();
		for(WebElement we:option)
		{
			String texttoinsert = we.getText();
			ts.add(texttoinsert);
		}
		for(String text:ts)
		{
			System.out.println(text);
		}
		
	}

}

