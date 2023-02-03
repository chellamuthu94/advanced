package stepcalender;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class keyaction {
public static	WebDriver driver;
@Test
	@Given("I want to verify the keyword")
	public void i_want_to_verify_the_keyword() throws AWTException {
		 driver = new ChromeDriver();
        driver.get("https://www.amazon.in/dp/B09Q92JKNG?&tag=buynow9908-21");	    
	    driver.findElement(By.xpath("//*[@id='buy-now-button']")).click();
	    driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("7530022412");
	    
	    driver.findElement(By.xpath("//*[@id='continue']"));
	   Robot robot = new Robot();
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	}

	@When("automate the keyboard")
	public void automate_the_keyboard() throws AWTException {

	    driver.findElement(By.xpath("//*[@id='ap_password']"));
		   Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
	    driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("chella1#");
	    driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	}


}
