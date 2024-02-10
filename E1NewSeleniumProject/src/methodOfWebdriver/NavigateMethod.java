package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();// to lauch browser
	
    driver.navigate().to("https://www.flipkart.com/");//to lauch the web application
    Thread.sleep(5000);
    
    driver.navigate().back(); //to navigate backward
    Thread.sleep(5000);
    driver.navigate().forward(); // to navigate forward
    Thread.sleep(5000);
    driver.navigate().refresh(); // to refresh
}
}
