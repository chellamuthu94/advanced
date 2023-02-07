package stepcalender;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("");

	
	WebElement From = driver.findElement(By.xpath(""));
	WebElement To = driver.findElement(By.xpath(""));
	Actions builder = new Actions(driver);

 builder.clickAndHold(From).moveToElement(To).release(To).build().perform();
	
}
}