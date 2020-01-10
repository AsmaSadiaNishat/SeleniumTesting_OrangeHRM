/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author zahid
 */
public class Login {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Developing_Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPimModule");
        
        driver.manage().window().maximize();
        //incorrect username/password:
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("a");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        
        Thread.sleep(15000);
        //correct username and password:
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        
        Thread.sleep(15000);

        System.out.println (driver.getTitle());
        driver.quit();
    }

}
