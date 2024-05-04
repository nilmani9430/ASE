package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lab4 {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","C:/Users/nilma/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.iiitsonepat.ac.in/");   
        System.err.println(driver.getTitle());
        driver.get("https://iiitsonepat.ac.in/academics/");
        System.err.println(driver.getCurrentUrl());
        System.err.println(driver.getTitle());
        driver.quit();
    }

}
