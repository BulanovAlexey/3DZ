package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver  = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.get("https://afisha.ru");
        WebElement inputSearch = webDriver.findElement(By.xpath("//input[@placeholder='Событие, актер, место']"));
        inputSearch.sendKeys("Брат");
        webDriver.findElement(By.xpath("//div[.='Брат'")).click();

        Thread.sleep(5);
        webDriver.quit();
    }


    }

