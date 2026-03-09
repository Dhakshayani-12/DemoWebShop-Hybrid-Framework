package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

public LoginPage(WebDriver driver) {
this.driver = driver;
}

public void loginUser() throws Exception {

driver.findElement(By.linkText("Log in")).click();
Thread.sleep(2000);

driver.findElement(By.id("Email")).sendKeys("dhakshi45@gmail.com");

driver.findElement(By.id("Password")).sendKeys("123456");

driver.findElement(By.xpath("//input[@value='Log in']")).click();

Thread.sleep(6000);

}

}