package testingBaba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBabaSInglePageAutomation {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.get("http://testingbaba.com/old/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/button")).click();
       driver.findElement(By.xpath("/html/body/div[2]/header/nav[2]/div/ul/li[5]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/h2/button")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[1]")).sendKeys("aman");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[2]")).sendKeys("aman@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[1]")).sendKeys("noida sector 63");
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[2]")).sendKeys("new delhi, ashok nagar");
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[3]")).click();
	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label"));
	for(int i=1; i<list.size(); i=i+2)
	{
		String val = list.get(i).getText();
		System.out.println(val);
	}
	
	
	}
}