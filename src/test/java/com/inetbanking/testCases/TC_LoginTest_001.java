package com.inetbanking.testCases;
import com.inetbanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass

{
    @Test
    public void loginTest() throws IOException {


        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("Entered user ID");
        lp.setPassword(password);
        logger.info("Entered password");
        lp.clickLogin();


        if(driver.getTitle().equals("GTPL Bank Manager HomePageXXX"))
        {
            Assert.assertTrue(true);
            logger.info("Login Test passed");
        }else{
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
        }

    }
}
