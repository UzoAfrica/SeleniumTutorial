package org.example.AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAuthentication {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        String username = "admin";
        String password = "admin";
        String URL = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

        driver.get(URL);

    }
}
