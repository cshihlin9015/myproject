package com.csl9015.gueaa;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10);
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        for (int i = 1; i < 5; i++) {
            System.out.print("Please enter a number : (" + i + "/4)");
            number = scanner.nextInt();
            System.out.println("第" + i + "次 : " + number);
            if (number < secret) {
                System.out.println("higher");
            } else if (number > secret) {
                System.out.println("lower");
            } else {
                System.out.println("Great,the number is " + number);
                break;
            }
        }
    }
}
