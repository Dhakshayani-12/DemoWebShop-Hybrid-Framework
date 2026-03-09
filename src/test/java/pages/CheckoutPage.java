package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

WebDriver driver;

public CheckoutPage(WebDriver driver){
this.driver = driver;
}

public void checkoutProcess() throws Exception {

driver.findElement(By.linkText("Shopping cart")).click();
Thread.sleep(6000);

driver.findElement(By.id("termsofservice")).click();

driver.findElement(By.id("checkout")).click();
Thread.sleep(6000);

// BILLING
driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
Thread.sleep(2000);

// SHIPPING
driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
Thread.sleep(2000);

// SHIPPING METHOD
driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
Thread.sleep(2000);

// PAYMENT METHOD
driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
Thread.sleep(2000);

// PAYMENT INFO
driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
Thread.sleep(2000);

// CONFIRM ORDER
driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

}
}