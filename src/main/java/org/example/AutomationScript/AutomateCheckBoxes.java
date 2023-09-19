package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        checkbox.click();
        Thread.sleep(5000);
        checkbox.click();

        WebElement welcome = driver.findElement(By.id("welcome"));
        String ActualValue = welcome.getText();

        //checkbox.getText()
        String ExpectedValue = "Welcome Paul";

        if(ActualValue == ExpectedValue )
        {
            System.out.print("Test case passed");
        }else
            System.out.println("Test case failed");
    }
}