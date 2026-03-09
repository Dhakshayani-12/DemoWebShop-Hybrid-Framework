package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage {

WebDriver driver;

public BooksPage(WebDriver driver) {
this.driver = driver;
}

public void addBookToCart() throws Exception {

driver.findElement(By.linkText("Books")).click();
Thread.sleep(3000);

driver.findElement(By.linkText("Computing and Internet")).click();
Thread.sleep(3000);

driver.findElement(By.id("add-to-cart-button-13")).click();
Thread.sleep(6000);

}

}