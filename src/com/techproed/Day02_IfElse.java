package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        // ilk önce sayfanın başlığını alalım.
        String sayfaBasligi = driver.getTitle();
        if( sayfaBasligi.contains("Car") ){
            System.out.println("Car kelimesini içeriyor.");
        }else{
            System.out.println("Car kelimesini içermiyor.");
        }
        driver.quit();
    }
}
