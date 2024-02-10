package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
    WebElement usntextbox=driver.findElement(By.id("email"));
    usntextbox.sendKeys("ranishele@gmail.com");
    Thread.sleep(2000);
    WebElement passtextbox=driver.findElement(By.id("pass"));
    passtextbox.sendKeys("rani123");
    Thread.sleep(2000);
    WebElement loginButton=driver.findElement(By.tagName("button"));
    
    
}
}
