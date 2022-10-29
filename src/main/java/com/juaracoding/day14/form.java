package com.juaracoding.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class form {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://formy-project.herokuapp.com/form";

        driver.get(url);

        int detik = 1;

        String titleFormy = driver.getTitle();
        System.out.println(titleFormy);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement first_name = driver.findElement(By.xpath("//*[@id='first-name']"));
        first_name.sendKeys("harun");
        System.out.println("input first-name");

        driver.findElement(By.id("last-name")).sendKeys("salman");
        System.out.println("input last-name");

        driver.findElement(By.id("job-title")).sendKeys("Logistik");
        System.out.println("input job-title");

//Highest level of education


        WebElement titleformy = driver.findElement(By.xpath("/html/body/div/form/div/div[4]/div[1]/strong/label"));
        System.out.println("titleformy:" + titleformy.getText());


        driver.findElement(By.xpath("/html/body/div/form/div/div[4]/div[2]/input")).click();
        System.out.println("High School Radio Clicked");

        driver.findElement(By.xpath("//html/body/div/form/div/div[4]/div[3]/input")).click();
        System.out.println("College Radio Clicked");

        driver.findElement(By.xpath("/html/body/div/form/div/div[4]/div[4]/input")).click();
        System.out.println("Grad School Radio Clicked");

        //sex

        driver.findElement(By.xpath("/html/body/div/form/div/div[5]/div[2]/input")).click();
        System.out.println("Male");
        driver.findElement(By.xpath("/html/body/div/form/div/div[5]/div[3]/input")).click();
        System.out.println("Female");


        //Years of experience


        driver.findElement(By.xpath("/html/body/div/form/div/div[6]/select")).click();
        System.out.println("select menu");


        driver.findElement(By.xpath("/html/body/div/form/div/div[6]/select/option[3]")).click();
        System.out.println("2-4");

        //Date

        WebElement formcontrol;
        driver.findElement(By.xpath("/html/body/div[1]/form/div/div[7]/input")).click();
        System.out.println("Date");

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[2]")).click();
        System.out.println("Kalender");


        // scroll vertical 1000 pixel
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]")).click();
        System.out.println("button submit clicked");

        //delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}