package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5500/.vs/New%20folder/Registration.htm");
	WebElement textBox=driver.findElement(By.tagName("input"));
	textBox.sendKeys("manager");
}
}
//note inputs are passed to username textfield bercause it is the 1st element designed with input tag