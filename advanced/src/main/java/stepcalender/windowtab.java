package stepcalender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class windowtab {
public static	WebDriver driver;
String parentWindow;
	@Given("verify the window tab")
	public void verify_the_window_tab() throws InterruptedException {

			 driver = new ChromeDriver();


			driver.manage().window().maximize();
			driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 parentWindow = driver.getWindowHandle();
			System.out.println("Parent Window " + parentWindow);
			driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			    System.out.println("Child Window ::::: " + winHandle);
			    Thread.sleep(3000);
			    driver.getCurrentUrl();
			    System.out.println( driver.getCurrentUrl());
			}
			
		}
	

	@Then("verify the windowswitching")
	public void verify_the_windowswitching() throws InterruptedException {
		  Thread.sleep(1000);
			driver.switchTo().window(parentWindow);
			Thread.sleep(3000);
			driver.quit();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  
	}

}
