package stepcalender;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class upload {
	@Given("verify the upload and download")
	public void verify_the_upload_and_download() throws AWTException {
	ChromeDriver driver = new ChromeDriver();   
	
	driver.get("https://forms.studio/demo");
	driver.findElement(By.xpath("//*[@id='ctrlq-file-5-temp']")).click();
String	file ="C:\\Users\\DELL\\Downloads\\selenium_course_content (1).pdf";
StringSelection selection= new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);

robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
