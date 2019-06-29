package com.csl9015.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            InputStream is = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");
        }
        System.out.println("File open success");

    }
}
