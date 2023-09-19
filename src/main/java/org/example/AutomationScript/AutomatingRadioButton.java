package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingRadioButton {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement RadioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));

        RadioButton.click();
        RadioButton.isDisplayed();
        RadioButton.isEnabled();
        RadioButton.isSelected();

        System.out.println(RadioButton.getText());
        System.out.println(RadioButton.getAttribute("class"));
        System.out.println(RadioButton.getTagName());

    }
}
