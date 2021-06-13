package com.pages;

import com.utilitiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturePage {
    public ManufacturePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    // select your files
    @FindBy(css = "div[class='h3d-button h3d-button--s h3d-button--primary']")
    public WebElement uploadFormFileInput;




}