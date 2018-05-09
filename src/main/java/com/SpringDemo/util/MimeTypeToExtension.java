package com.SpringDemo.util;

import java.util.HashMap;
import java.util.Map;

public class MimeTypeToExtension {

    public static  final Map<String, String>MIME_TYPE_TO_EXTENSION=new HashMap<>();
    static{
        MIME_TYPE_TO_EXTENSION.put("image/jpeg","jpg");
        MIME_TYPE_TO_EXTENSION.put("image/jpg","jpg");
        MIME_TYPE_TO_EXTENSION.put("image/png","png");

    }

}
