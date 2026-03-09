package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

public WebDriver driver;

@BeforeMethod
public void setup() throws Exception {

driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://demowebshop.tricentis.com/");

Thread.sleep(3000);
}

@AfterMethod
public void tearDown() throws Exception {

Thread.sleep(5000);
driver.quit();

}

}