package stepcalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class calender {
 static public WebDriver driver;
	
	@Test(priority = 0)
	@Given("I want to verify the calender")
	public void i_want_to_verify_the_calender() throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
			driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Change the month']")).click();
		WebElement	element=	driver.findElement(By.xpath("//*[@title='Change the month']"));
				Select  select= new Select(element);
				select.selectByIndex(10);

	}
	@Test(priority = 1)
	@When("automate the months and years")
	public void automate_the_months_and_years() throws InterruptedException  {
 
		Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@title='Change the year']")).click();
			WebElement	element1=	driver.findElement(By.xpath("//*[@title='Change the year']"));
			Select select1= new Select(element1);
			select1.selectByIndex(10);
			   	
		
	}


}
