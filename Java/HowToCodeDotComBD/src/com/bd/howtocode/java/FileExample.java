package com.bd.howtocode.java;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("F:\\Projects\\problem-solving\\Java\\HowToCodeDotComBD\\hello.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exists, lets create one.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
