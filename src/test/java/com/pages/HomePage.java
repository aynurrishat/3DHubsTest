package com.pages;

import com.utilitiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);


    }


    // get instant quote
 @FindBy(xpath ="//body/div[@id='content']/div[1]/div[2]/a[1]/span[1]")
    public WebElement homevHeroButton;

}
