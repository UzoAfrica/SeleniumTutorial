package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomateLinks {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(int i =0; i<links.size(); i++)
        {
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println(links.get(i).getText());
        }
    }
}
