package com.example.Lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Byclass {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.findElement(By.className("whsOnd")).sendKeys("new@gmail.com");

    }
    
}
