package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Results {
WebDriver driver;
By resultBox =By.id("rso");


public Results (WebDriver driver)
{
	this.driver = driver;
}

public int getSearchResSize () {
	
	return driver.findElements(resultBox).size();

	
}

}
