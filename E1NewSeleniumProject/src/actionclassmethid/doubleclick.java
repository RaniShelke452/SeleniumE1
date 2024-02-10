package actionclassmethid;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=1");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement yesbutton1 = driver.findElement(By.id("btn20"));
		WebElement nobutton2 = driver.findElement(By.id("btn23"));
		WebElement ratingbutton3 = driver.findElement(By.id("btn26"));
		
		Actions act = new Actions(driver);// to create the object of actions class
		
		act.doubleClick(yesbutton1).perform();//to perform double click opration on hes button
		act.doubleClick(nobutton2).perform();// to perform double click operation on no button
		act.doubleClick(ratingbutton3).perform();// to 
		
		
		
		
		
	}

}
