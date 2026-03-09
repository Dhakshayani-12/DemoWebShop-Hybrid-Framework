package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JewelryPage {

WebDriver driver;

public JewelryPage(WebDriver driver) {
this.driver = driver;
}

public void addBraceletToCart() throws Exception {

driver.findElement(By.linkText("Jewelry")).click();
Thread.sleep(6000);

driver.findElement(By.linkText("Black & White Diamond Heart")).click();
Thread.sleep(3000);

driver.findElement(By.id("add-to-cart-button-14")).click();
Thread.sleep(6000);

}

}