package org.example.AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigationMethods {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
            //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

            WebDriver driver = new ChromeDriver();
            //WebDriver driver = new FirefoxDriver();

            driver.get("https://www.selenium.dev/");
            driver.navigate().to("https://www.selenium.dev/downloads/");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().forward();
            Thread.sleep(5000);
            driver.navigate().refresh();
        }
    }

