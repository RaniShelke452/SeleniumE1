package DropodownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("file:///C:/Users/RANI/Desktop/Dropdown/htmlcode.html");
    
    //to handle static dropdown we need create object

   WebElement singleselectdropdown = driver.findElement(By.id("menu"));
     Select sel = new Select(singleselectdropdown);
     sel.selectByIndex(5);// used 1st method select byindex
     
     sel.selectByValue("v3");// used 2nd method slect byvalue
     
     sel.selectByVisibleText("samosa");
     
     
     
     
   
    
	}

}

