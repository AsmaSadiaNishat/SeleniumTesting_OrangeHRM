/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author zahid
 */
public class LeaveList {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Developing_Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPimModule");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");        
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();        
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a/b")).click();  
        driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveList\"]")).click();  

        driver.findElement(By.xpath("//*[@id=\"calFromDate\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"calToDate\"]")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"calFromDate\"]")).sendKeys("2015-08-03");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"calToDate\"]")).sendKeys("2015-10-01");
        driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
   
    }
    
}
