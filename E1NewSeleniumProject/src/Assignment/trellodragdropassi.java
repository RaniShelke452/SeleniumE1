package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trellodragdropassi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/home");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("ranishelke452@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("rani@2002");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		//driver.findElement(By.xpath("(//div[text()='E1'])[1]")).click(); he sir ni lihile hote tynchyamade 2match dkhavat hote mnun index getla
		
		driver.findElement(By.xpath("//div[text()='E1']")).click();
		
		//for source
		WebElement javasrc = driver.findElement(By.xpath("//a[text()='java']"));
		WebElement sqlsrc = driver.findElement(By.xpath("//a[text()='sql']"));
		WebElement manualsrc = driver.findElement(By.xpath("//a[text()='manual testing']"));
		WebElement seleniumsrc = driver.findElement(By.xpath("//a[text()='selenium']"));
		
		
       // for target
		WebElement mockDetail = driver.findElement(By.xpath("//h2[text()='mock detal']"));
		WebElement mockgiven = driver.findElement(By.xpath("//h2[text()='mock given']"));
		WebElement mockschedule = driver.findElement(By.xpath("//h2[text()='mock scheduled']"));
		WebElement mockpending = driver.findElement(By.xpath("//h2[text()='mock pending']"));
		
		
		//drag and drop operation
		act.dragAndDrop(javasrc, mockgiven).perform();
		act.dragAndDrop(manualsrc, mockgiven).perform();
		act.dragAndDrop(sqlsrc,mockschedule ).perform();
		act.dragAndDrop(seleniumsrc,mockpending ).perform();
		
		//to perform context click context means right click operation
		WebElement contextclick = driver.findElement(By.xpath("//a[text()='java']"));
		act.contextClick(contextclick).perform();
		
		
		
		
		
		
		
	}

}
