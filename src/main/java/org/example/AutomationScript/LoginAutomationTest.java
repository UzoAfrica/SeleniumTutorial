package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAutomationTest {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://www.codewars.com/users/sign_in");

        WebElement username = driver.findElement(By.id("user_email"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("ibezimuzomajoseph@gmail.com");

        WebElement password = driver.findElement(By.id("user_password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Uzo@08067829077");

//        WebElement signIn = driver.findElement(By.xpath(button[normalize-space()='Sign in']));
//        signIn.isDisplayed();
//        signIn.isEnabled();
//        signIn.sendKeys("Uzo@08067829077");
    }
}
