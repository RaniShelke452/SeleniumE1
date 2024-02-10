package actionclassmethid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();
		WebElement rightclick = driver.findElement(By.partialLinkText("Right Click"));
		act.click(rightclick).click();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		act.contextClick(button1).perform();
	    WebElement buttono1ption = driver.findElement(By.xpath("\"//div[text()='Yes'"));
	    act.click(buttono1ption).click();
		
		
		
		//WebElement button2 = driver.findElement(By.xpath(""));
		//Object button3 = driver.findelement(By.xpath(""));
		
	}
	

}
