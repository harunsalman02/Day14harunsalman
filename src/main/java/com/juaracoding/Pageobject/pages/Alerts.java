package com.juaracoding.Pageobject.pages;

import com.juaracoding.Pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts {
private WebDriver driver;

public Alerts() {
    this.driver = DriverSingleton.getDriver();
    PageFactory.initElements(driver, this);
}

@FindBy(id = "alertButton")
    WebElement btnAlertOne;

@FindBy(id = "timerAlertButton")
WebElement btnAlertTwo;

@FindBy(id = "confirmaButton")
    WebElement  btnAlertThree;

@FindBy(id = "promoButton")
    WebElement  btnAlertFour;

public void alertButton(){
    btnAlertOne.click();
    driver.switchTo().alert().accept();//Button OK
    System.out.println("Button OK Clicked");
}

public void timerAlertButton(){
    btnAlertTwo.click();
    delay(6);
    driver.switchTo().alert().accept();//Button OK
    System.out.println("Button OK Clicked with Timer");
}

public void confirmButton(){
btnAlertThree.click();
delay(1);
driver.switchTo().alert().accept();//Button OK
    System.out.println("Button Confirm OK Cliked");
    btnAlertThree.click();
    delay(1);
    driver.switchTo().alert().dismiss();//Button Cancel
    System.out.println("Button Confirm Cancel Clicked");
}

public void promoButton(){
    delay(1);
    btnAlertFour.click();
    delay(1);
    driver.switchTo().alert().sendKeys("HARUN SALMAN");
    delay(1);
    driver.switchTo().alert().accept();//Button OK
    System.out.println("Button Prompt OK Clicked with Input User Name");
}


public static void delay(int detik){
    //delay
    try {
        Thread.sleep(1000*detik);
    } catch (InterruptedException e){
        throw new RuntimeException(e);
    }
}

}