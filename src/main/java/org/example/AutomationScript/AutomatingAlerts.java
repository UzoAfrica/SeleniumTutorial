package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("Hey I am providing data in javascript pop up");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();


    }

}