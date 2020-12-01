package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
       driver.close();
       driver.quit();


    }
}
