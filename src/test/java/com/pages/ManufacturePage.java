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


    @FindBy(id = "file-btn")
    public WebElement uploadFormFileInputButton;


   @FindBy(id="email")
    public  WebElement emailBox;


   @FindBy(xpath= " //button[@type='submit']")
   public WebElement continueInstantQuoteBox;



 @FindBy(css="i[class='h3d-icon h3d-icon--1-5x h3d-icon--close']" )
    public  WebElement crossSign;

 @FindBy(css="div[title='3D_IGES-402-101-00_WFS.igs']")
 public  WebElement uploadFileLocation;


}