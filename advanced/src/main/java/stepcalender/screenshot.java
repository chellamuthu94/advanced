package stepcalender;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;

public class screenshot {
	@Given("failure case screenshot")
	public void failure_case_screenshot() throws AWTException, IOException {
		WebDriver	 driver = new ChromeDriver();
	TakesScreenshot screen=(TakesScreenshot)driver;
	File file=	screen.getScreenshotAs(OutputType.FILE); 
	File source= new File("D://.jpg");
	FileHandler.copy(file, source);
 

      
	}

	@Given("verify another screenshot")
	public void verify_another_screenshot() throws AWTException, IOException {
		Robot robot = new Robot();
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle rectangle= new Rectangle(screenSize);
	    BufferedImage source1=robot.createScreenCapture(rectangle);
	    File destinationsFile=new File("D:\\SS3.png");
	    ImageIO.write(source1, "png", destinationsFile); 
	}

}
