package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    public Properties prop;

    public ReadConfig() {
        File src = new File("./configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        }catch (Exception e)
        {
            System.out.println("Exception is : " + e.getMessage());
        }
    }

    public String getApplicationUrl() {
        String url = prop.getProperty("baseURL");
        return url;
    }

    public String getUsername() {
        String uName = prop.getProperty("username");
        return uName;
    }

    public String getPassword() {
        String pwd = prop.getProperty("password");
        return pwd;
    }

    public String getFirefoxPath() {
        String fPath = prop.getProperty("firefoxpath");
        return fPath;
    }

    public String getChromePath() {
        String cPath = prop.getProperty("chromepath");
        return cPath;
    }



}
