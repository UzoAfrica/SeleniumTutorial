package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement iframeTextBox = driver.findElement(By.id("tinymce"));
                //.sendKeys("Some text here");
        Thread.sleep(5000);
        iframeTextBox.clear();
        Thread.sleep(5000);
        iframeTextBox.sendKeys("I am writing a new text into the text keys");
        Thread.sleep(5000);
        driver.quit();



    }
}
