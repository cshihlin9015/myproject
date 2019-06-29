package com.csl9015.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
//        inputstream();
//        filereader();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data2.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            FileInputStream is = new FileInputStream("data.txt");
            int n = is.read();
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            InputStream is = new FileInputStream(file);
//            int n = is.read();
//            System.out.println(n);
//            System.out.println(is.read());
//            System.out.println(is.read());
//            System.out.println(is.read());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("message");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("File open success");
    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data2.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
