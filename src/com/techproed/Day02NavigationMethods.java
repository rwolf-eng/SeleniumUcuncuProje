package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("https://www.Google.com");
        // driver.close();
        //driver.quit();
        driver.navigate().to("http://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
