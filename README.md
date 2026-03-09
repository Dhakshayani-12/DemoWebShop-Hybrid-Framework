# Demo Web Shop Automation - Hybrid Framework

This project automates the Demo Web Shop e-commerce application using Selenium WebDriver with Java and Hybrid Automation Framework (POM + TestNG).

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Hybrid Framework (POM + TestNG)
- Eclipse IDE

---

## Project Setup (From Scratch)

Follow the steps below to create this automation project.

### 1. Install Java

Download and install JDK.

Check installation:


java -version


---

### 2. Install Eclipse IDE

Download and install Eclipse IDE for Java Developers.

---

### 3. Install Maven

Download Maven and configure it.

Verify installation:


mvn -version


---

### 4. Create Maven Project in Eclipse

Steps:

1. Open Eclipse
2. Click File → New → Maven Project
3. Select maven-archetype-quickstart
4. Enter:


GroupId: automation
ArtifactId: DemoWebShopAutomation


5. Click Finish

---

### 5. Add Dependencies in pom.xml

Add Selenium and TestNG dependencies.

```xml
<dependencies>

<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.18.1</version>
</dependency>

<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.9.0</version>
</dependency>

</dependencies>

Right click project → Maven → Update Project

Project Structure
src/test/java
   pages
   tests
   utilities

src/test/resources
   testdata

pom.xml
testng.xml
Test Scenarios Automated

The following e-commerce workflows are automated:

1.Launch Browser

2.User Registration

3.User Login

4.Search Jewelry Product

5.Add Jewelry Product to Cart

6.Search Books Product

7.Add Books Product to Cart

8.Checkout Process

9.Billing Address Entry

10.Shipping Process

11.Payment Method

12.Order Confirmation

13.Logout

How to Run the Project

Open project in Eclipse

Locate:

testng.xml

Right click → Run As → TestNG Suite

Automation tests will start executing.
