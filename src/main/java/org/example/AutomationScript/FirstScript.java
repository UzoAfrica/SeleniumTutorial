package org.example.AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

    public static void main(String[] args) {

        //System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://codewithmosh.com/");

    }

}
