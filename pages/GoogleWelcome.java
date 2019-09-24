package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleWelcome {
	
	WebDriver driver;
	
	By searchInput = By.name("q");
	By submit= By.name("btnK");
	
	public GoogleWelcome (WebDriver driver) {
		this.driver=driver;
	}
	
	private void inputQuery (String query)
	{
		driver.findElement(searchInput).sendKeys(query);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	private void submitQuery ()
	{
		driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void performSearch (String query)
	{
		this.inputQuery(query);
		this.submitQuery();
	}

}
