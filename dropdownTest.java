package edureka.testng.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownTest {
	
	@Test
	public void dropDownTest()
	{
		WebDriver driver = utilityDrivers.getDriver("Chrome");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select ddown = new Select(dropdown);
		//ddown.selectByIndex(1);
		//ddown.selectByValue("2");
		ddown.selectByVisibleText("Option 2");
		List<WebElement> ddlist = ddown.getOptions();
		System.out.println("No of options in the dropdown is : " +ddlist.size());
		for(int i=0; i<(ddlist.size());i++)
		{
			String str = ddlist.get(i).getText();
			System.out.println("Option " +i+ ": " +str);
		}
	}

}
