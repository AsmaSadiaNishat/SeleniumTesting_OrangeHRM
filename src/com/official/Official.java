/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.official;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author zahid
 */
public class Official {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Developing_Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPimModule");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");    
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();        
        
        //Official Website:
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/img")).click(); 
                
    }
    
}
