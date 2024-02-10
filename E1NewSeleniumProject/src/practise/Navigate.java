package practise;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
  ChromeDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.navigate().to("https://www.flipkart.com/");
  
  driver.navigate().back();
  Thread.sleep(1000);
  driver.navigate().forward();
  Thread.sleep(1000);
  driver.navigate().refresh();
  
  
  
}
}
