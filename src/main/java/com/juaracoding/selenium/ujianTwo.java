package com.juaracoding.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ujianTwo {
    public static void main (String [] args){
        //System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        //Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        int detik = 1;
WebElement titleMenu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
System.out.println("Title Menu: "+ titleMenu.getText());

delay (detik);
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/oi/li/span/label/span[3]")).click();
System.out.println("Home Checklist");

delay(detik);
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
System.out.println("Button Toggle Clicked");
delay(detik);
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]")).click();
System.out.println("Desktop UnChecklist");
delay(detik);
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/spam/label/span[3]")).click();
System.out.println("DOcuments Unchecklist");
delay(detik);
driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/spam/label/span[3]")).click();
System.out.println("Download UnChecklist");


//Menu Radio Button
delay(detik);
driver.findElement(By.id("item-2")).click();

WebElement titleMenuTwo = driver.findElement(By.xpath("//*[@id-\"app\"]/div/div[1]/div"));
System.out.println("Title Menu:"+titleMenuTwo.getText());

delay(detik);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
System.out.println("Yes Radio Clicked");
delay(detik);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]div/[2]/div[3]/label")).click();
System.out.println("Impressive Radio Clicked");

JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement yesRadio = driver.findElement(By.id("yesRadio"));
WebElement impressiveRadio = driver.findElement(By.id("impressive Radio"));
js.executeScript("arguments[0].click();",yesRadio);
System.out.println("Yes Radio Clicked use JavascriptExecutor");
js.executeScript("arguments[0].click();", impressiveRadio);
System.out.println("Impressive Radio Clicked use JavascriptExecutor");

driver.get("https://www.google.com");
System.out.println("Google");
WebElement inputSearch = driver.findElement((By.xpath("/html/body/div[1]/div[3]/from/div[1]/div[1]/div[1]/div/div[2]/input")));
delay(detik);
inputSearch.sendKeys("Wikipedia");
delay(detik);
inputSearch.sendKeys(Keys.ENTER);

driver.navigate().back();
System.out.println("Navigate Back");

driver.get("http://demoqa.com/select-menu");
System.out.println("Select Menu");
js.executeScript("window.scrollBy(0,500)");
delay(detik);
WebElement elementSelect = driver.findElement(By.id("oldSelectMenu"));
Select oldSelectMenu = new Select(elementSelect);
oldSelectMenu.selectByIndex(1);
delay(detik);
oldSelectMenu.selectByValue("10");
delay(detik);
oldSelectMenu.deselectByVisibleText("Magenta");

delay(3);

driver.quit();

    }
static void delay(int detik){
    //delay
    try {
        Thread.sleep(1000 * detik);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

}