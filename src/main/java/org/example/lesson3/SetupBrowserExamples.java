package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupBrowserExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--headless");
        ChromeOptions.addArguments("--disable-notifications");
        ChromeOptions.addArguments("user-agent=Googlebot/2.1 (+http://google.com/bot.html)");



        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.quit();

    }
}
