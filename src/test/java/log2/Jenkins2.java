package log2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins2 {
	@Test
	private void la() throws IOException, InterruptedException {

	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in");
     
     driver.navigate().to("https://www.youtube.com");
     Thread.sleep(2000);
     driver.navigate().refresh();
     TakesScreenshot ts = (TakesScreenshot) driver;
     File src = ts.getScreenshotAs(OutputType.FILE);
     File d = new File("F:\\RsoftNew\\Zen2\\ScreenShot\\youtube.png");
     FileUtils.copyFile(src, d);
     System.out.println("Yesh its fine 2");}
}
