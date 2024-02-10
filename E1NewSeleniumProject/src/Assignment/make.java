package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class make {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling:: div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[text()='Processor")); it is already open so no need to open
		driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling:: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//div[text()='RAM Capacity']"));
		
		
		
		WHN1
		
		
		
		for(int i=0; i<laptops.size()i++)
		{
		  String op = laptops.get(i).getText();
		  for(int j=i; j<=i; j++)
		  {
			  String price = laptopPrices.get(j).getText();
			  System.out.println(op+" : "+price);
			  Thread.sleep(1000);
		  }
		  System.out.println();
					  
		  }
		
		
		
		
		
		
	}

}

