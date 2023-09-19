package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingNestedFrame {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        List<WebElement> f = driver.findElements(By.tagName("frame"));
        System.out.println("Total Frame: "+ " " +f.size());

        driver.switchTo().frame(1);

        String BottonFrame = driver.findElement(By.tagName("body")).getText();

        System.out.println(BottonFrame);

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-left");
        String LeftFrame = driver.findElement(By.tagName("body")).getText();

        System.out.println(LeftFrame);
    }
}
