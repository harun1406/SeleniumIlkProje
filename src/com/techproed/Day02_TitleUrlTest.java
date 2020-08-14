package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("http://youtube.com");

        String titleYoutube = webDriver.getTitle();

        if (titleYoutube.toLowerCase().contains("video")){
            System.out.println("youtube tite ' li video kelimesini iceriyor " + titleYoutube);
        }else{
            System.out.println("youtube tite ' li video kelimesini icermiyor " + titleYoutube);
        }
        webDriver.quit();


    }
}
