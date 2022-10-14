package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ujianone {
    public static void main(String[] args) {

        //System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // WebDriverManager.chromeDriver class.

        //instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url =" https://formy-project.herokuapp.com/buttons";

        driver.get(url);

        String titleName = driver.getTitle();
        System.out.println(titleName);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //delay

        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
       userName.sendKeys("JuaraCoding");//sendKeys("JuaraCoding")

        System.out.println("input username");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        System.out.println("input user email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        System.out.println("input current address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        System.out.println("input permanent address");

        // scroll vertical 1000 pixel
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("submit")).click();
        System.out.println("button submit clicked");

        // delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}