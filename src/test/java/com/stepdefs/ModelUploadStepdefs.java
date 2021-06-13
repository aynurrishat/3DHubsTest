package com.stepdefs;

import com.pages.HomePage;
import com.pages.ManufacturePage;
import com.utilitiies.ConfigurationReader;
import com.utilitiies.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class ModelUploadStepdefs {
    HomePage homePage = new HomePage();
    ManufacturePage manufacturePage = new ManufacturePage();

    @Given("on home page")
    public void on_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("click on home hero button")
    public void click_on_home_hero_button() {

        homePage.homevHeroButton.click();

    }

    @And("upload file with upload file button")
    public void click_on_upload_form_file_input() {

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/files/3D_IGES-402-101-00_WFS.igs";
        String fullPath = projectPath + "/" + filePath;
        System.out.println(fullPath);
        manufacturePage.uploadFormFileInputButton.sendKeys(fullPath);

    }

    @And("send valid user email address")
    public void send_valid_user_email_address() {


        manufacturePage.emailBox.sendKeys("aynurrishat@gmail.com");

    }

    @And("click on continue your instant quote button")
    public void click_on_continue_your_instant_quote_button() throws InterruptedException {

        manufacturePage.continueInstantQuoteBox.click();
        Thread.sleep(5000);

    }

    @And("click on cross sign pop up")
    public void click_on_cross_sign_pop_up() {

        manufacturePage.crossSign.click();

    }

    @Then("Verify user can upload file")
    public void user_can_upload_file() throws InterruptedException {

        Assert.assertTrue("verify that the file upload", manufacturePage.uploadFileLocation.isDisplayed());


    }


}









