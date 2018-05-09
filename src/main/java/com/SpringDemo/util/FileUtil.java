package com.SpringDemo.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    public static StringBuilder fileURL;
    private static Path filePath;
    private static String fileName;

    public static String saveFile(String directory, byte[] fileContent, String fileExtension) throws IOException{
        fileName=DemoConstants.UUID();
        fileURL=new StringBuilder();
        fileURL.append(directory)
                .append(File.separator)
                .append(fileName)
                .append(".")
                .append(fileExtension.toLowerCase());
        filePath= Paths.get(fileURL.toString());
        Files.createDirectories(filePath.getParent());
        Files.createFile(filePath);
        Files.write(filePath,fileContent);
        return fileName+"."+fileExtension;
    }
}
