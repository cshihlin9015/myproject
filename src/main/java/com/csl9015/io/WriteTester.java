package com.csl9015.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) {
        try {
            File jkDir=new File("E:\\jk");
            jkDir.mkdir();
            FileWriter fw = new FileWriter("E:\\jk\\output.txt");
            fw.write("abc");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
