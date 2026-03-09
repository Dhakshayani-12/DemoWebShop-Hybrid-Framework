package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

WebDriver driver;

public RegisterPage(WebDriver driver) {
this.driver = driver;
}

public void registerUser() throws Exception {

driver.findElement(By.linkText("Register")).click();
Thread.sleep(2000);

driver.findElement(By.id("gender-female")).click();

driver.findElement(By.id("FirstName")).sendKeys("Dhakshi");

driver.findElement(By.id("LastName")).sendKeys("Veeranki");

driver.findElement(By.id("Email")).sendKeys("dhakshi45@gmail.com");

driver.findElement(By.id("Password")).sendKeys("123456");

driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

driver.findElement(By.id("register-button")).click();

Thread.sleep(6000);

}

}