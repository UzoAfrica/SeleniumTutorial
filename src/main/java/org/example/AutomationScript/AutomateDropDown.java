package org.example.AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomateDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "/Users/decagon/Downloads/chromedriver_mac_arm64/chromedriver");
        //System.setProperty("web-driver.gecko.driver", "/Users/decagon/Downloads/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/By.html

        Select obj = new Select(driver.findElement(By.id("dropdown")));
        //obj.selectByIndex(2);
        //obj.selectByValue("2");
        //obj.selectByVisibleText("Option 1");

        //Count the number of options available in drop down
        List<WebElement> dropDownValueCount = obj.getOptions();
        System.out.print(dropDownValueCount.size());
    }
}
