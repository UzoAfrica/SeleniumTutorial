package org.example.AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlindMultipleTabAndWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        String MainTab = driver.getWindowHandle();
        System.out.println("MainTab");
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(MainTab);

        System.out.println(driver.getTitle());

    }
}
