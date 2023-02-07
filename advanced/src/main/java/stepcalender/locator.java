package stepcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class locator {
public static WebDriver  driver;
@Given("validation of xpath locator")
public void validation_of_xpath_locator() {
 
 driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
	
}

@Given("validation of types locator")
public void validation_of_types_locator() {
   

	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.linkText("")).sendKeys("");
	driver.findElement(By.className("")).sendKeys("");
	driver.findElement(By.tagName("")).sendKeys("");
	driver.findElement(By.id("")).sendKeys("");
	
}

}
