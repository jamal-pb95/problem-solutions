package com.bd.howtocode.java;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
    public static void main(String[] args) throws IOException {
        File dir = new File("F:\\Projects\\problem-solving\\Java\\HowToCodeDotComBD\\src\\MyDir");
        dir.mkdir();

        String dirPath = dir.getPath();
        System.out.println("Directory Path: " + dirPath);

        // lets create a new file
        String filename = "hello.txt";
        File file = new File(dirPath + File.separator + filename);
        file.createNewFile();

        String filePath = file.getPath();
        System.out.println("File Path: " + filePath);
    }
}
