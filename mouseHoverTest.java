package edureka.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseHoverTest {

	@Test
	public void mouseActionTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("//div[@id='content']/div/div[1]/img[@src='/img/avatar-blank.jpg']"));
		Thread.sleep(2000);
		Actions move = new Actions(driver);
		move.moveToElement(img).build().perform();
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//div[@id='content']/div/div[1]/div/h5[text()='name: user1']")).getText();
		System.out.println("Text on the 1st image is:" +str);
		
		
		WebElement img2 = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/img[@src='/img/avatar-blank.jpg']"));
		move.moveToElement(img2).build().perform();
		Thread.sleep(2000);
		String str1= driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/h5[text()='name: user2']")).getText();
		System.out.println("Text on the 2nd image is:" +str1);
		
		WebElement img3 = driver.findElement(By.xpath("//div[@id='content']/div/div[3]/img[@src='/img/avatar-blank.jpg']"));
		move.moveToElement(img3).build().perform();
		Thread.sleep(2000);
		String str2= driver.findElement(By.xpath("//div[@id='content']/div/div[3]/div/h5[text()='name: user3']")).getText();
		System.out.println("Text on the 3rd image is:" +str2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a")).click();
		System.out.println("Clicked on footer");
		
		
		
	}
}
