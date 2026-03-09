package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.BooksPage;
import pages.CheckoutPage;
import pages.JewelryPage;
import pages.LoginPage;
import pages.RegisterPage;

public class DemoWebShopTest extends BaseClass {

@Test
public void webshopHybridTest() throws Exception {

RegisterPage register = new RegisterPage(driver);

try {

// TRY REGISTER
register.registerUser();

Thread.sleep(2000);

// LOGOUT AFTER REGISTER
driver.findElement(By.linkText("Log out")).click();

System.out.println("User registered successfully");

}

catch(Exception e) {

System.out.println("User already registered, going to login");

}

// LOGIN
LoginPage login = new LoginPage(driver);
login.loginUser();

JewelryPage jewelry = new JewelryPage(driver);
jewelry.addBraceletToCart();

BooksPage books = new BooksPage(driver);
books.addBookToCart();

CheckoutPage checkout = new CheckoutPage(driver);
checkout.checkoutProcess();

}

}