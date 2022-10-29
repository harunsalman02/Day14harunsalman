package com.juaracoding.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.juaracoding.Pageobject.pages.Alerts.delay;

public class Element {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "  https://formy-project.herokuapp.com/buttons";
        driver.get(url);

        int detik = 1;

        //Buttons
        delay(detik);
        WebElement titleFormy = driver.findElement(By.xpath("//button[normalize-space()='Primary']"));
        System.out.println("Primary");
        driver.findElement(By.xpath("//button[normalize-space()='Success']"));
        System.out.println("Success");
        driver.findElement(By.xpath("//button[normalize-space()='Info']"));
        System.out.println("Info");
        driver.findElement(By.xpath("//button[normalize-space()='Warning']"));
        System.out.println("Warning");
        driver.findElement(By.xpath("//button[normalize-space()='Danger']"));
        System.out.println("Dangers");
        driver.findElement(By.xpath("//button[normalize-space()='Link']"));
        System.out.println("Link");
        driver.findElement(By.xpath("//button[normalize-space()='Left']"));
        System.out.println("Left");
        driver.findElement(By.xpath("//button[normalize-space()='Middle']"));
        System.out.println("Middle");
        driver.findElement(By.xpath("//button[normalize-space()='Right']"));
        System.out.println("Right");
        driver.findElement(By.xpath("//button[normalize-space()='1']"));
        System.out.println("1");
        driver.findElement(By.xpath("//button[normalize-space()='2']"));
        System.out.println("2");
        driver.findElement(By.xpath("//button[@id='btnGroupDrop1']"));
        System.out.println("Dropdown");

        JavascriptExecutor js = (JavascriptExecutor) driver;

         //Autocomplete

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        delay(detik);
        WebElement Autocomplete= driver.findElement(By.xpath("//input[@id='autocomplete']"));
        Autocomplete.sendKeys("ciater");
        System.out.println("input Address");

        driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/input")).sendKeys("serpong");
        System.out.println("input Street address");

        driver.findElement(By.xpath("//input[@id='route']")).sendKeys("tangerang");
        System.out.println("input Street address 2");

        driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("tangerang kota");
        System.out.println("input City");

        driver.findElement(By.xpath("//input[@id='administrative_area_level_1']")).sendKeys("banten");
        System.out.println("input State");

        driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("15317");
        System.out.println("input Zip code");

        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("juaracoding");
        System.out.println("input Country");

        //Checkboxes

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement titleCheckbox = driver.findElement(By.xpath("//h1[normalize-space()='Checkboxes']"));
        System.out.println("" + titleCheckbox.getText());

        delay(detik);
        driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
        System.out.println("checkbox-1");

        driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
        System.out.println("checkbox-2");

        driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
        System.out.println("checkbox-3");

        //delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}