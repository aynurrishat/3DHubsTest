package com.stepdefs;

import com.pages.HomePage;
import com.pages.ManufacturePage;
import com.utilitiies.ConfigurationReader;
import com.utilitiies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class ModelUploadStepdefs {

    @Given("on home page")
    public void on_home_page() throws InterruptedException {
       String url=ConfigurationReader.get("url");
       Driver.get().get(url);



    }

    @When("click on home hero button")
    public void click_on_home_hero_button() throws InterruptedException {

        HomePage homePage =new HomePage();
        homePage.homevHeroButton.click();


    }

    @When("click on upload form file input")
    public void click_on_upload_form_file_input() throws InterruptedException, AWTException {

        ManufacturePage manufacturePage=new ManufacturePage();

//        manufacturePage.uploadFormFileInput.sendKeys("\Users\aynurrishat\IdeaProjects\3DHubsTest\src\test\resources\features\3D_IGES-402-101-00_WFS.igs");

        String filePath = System.getProperty("user.dir") + "/src/res/test.pdf; driver.findElement(By.id("elementID")).sendKeys(filePath);
        manufacturePage.uploadFormFileInput.click();



    }


    @Then("can upload the model file")
    public void can_upload_the_model_file() throws InterruptedException, AWTException {

        System.out.println("helo");

//        File file =new File("src/test/resources/features/3D_IGES-402-101-00_WFS.igs");
//
//        StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
//
//        Robot robot = new Robot();
//
//        robot.keyPress(KeyEvent.VK_META);
//
//        robot.keyPress(KeyEvent.VK_TAB);
//
//        robot.keyRelease(KeyEvent.VK_META);
//
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.delay(500);
//        robot.keyPress(KeyEvent.VK_META);
//
//        robot.keyPress(KeyEvent.VK_SHIFT);
//
//        robot.keyPress(KeyEvent.VK_G);
//
//        robot.keyRelease(KeyEvent.VK_META);
//
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//
//        robot.keyRelease(KeyEvent.VK_G);
//
//        robot.keyPress(KeyEvent.VK_META);
//
//        robot.keyPress(KeyEvent.VK_V);
//
//        robot.keyRelease(KeyEvent.VK_META);
//
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyPress(KeyEvent.VK_ENTER);
//
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
//        robot.delay(500);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
//        System.out.println("File Upload passed");
//
//    }



}
}





