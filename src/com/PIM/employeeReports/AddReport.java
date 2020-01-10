/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PIM.employeeReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author zahid
 */
public class AddReport {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Developing_Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPimModule");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");        
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();        
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();       
        driver.findElement(By.xpath("//*[@id=\"menu_core_viewDefinedPredefinedReports\"]")).click();       
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();       
              
        driver.findElement(By.xpath("//*[@id=\"report_report_name\"]")).sendKeys("My Report");

        driver.findElement(By.xpath("//*[@id=\"btnAddDisplayField\"]")).click(); 
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click(); 
       
        System.out.println("Successfully Report is Added");
   
    }
    
}
