package com.SpringDemo.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

public class DemoConstants {


    public static final String UUID() {
        return UUID.randomUUID().toString();
    }
    public static final String[] USER_TYPE = {
            "ADMIN", "MANAGER", "OPERATOR"
    };

    public static String FILE_REPO = "D:\\Project_Docs\\NIIT-DEMO";

//    public static String FILE_REPO = "C:\\Program Files\\Apache Software Foundation\\Apache Tomcat 8.0.27\\proinProjectImages";

    public static String PRODUCT_REPO = FILE_REPO + File.separator + "product";


}
