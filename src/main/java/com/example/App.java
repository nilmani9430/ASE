package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.iiitsonepat.ac.in");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
