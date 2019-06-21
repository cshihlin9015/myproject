package com.csl9015.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter student's name : ");
        String name = scanner.next();
        System.out.print("Please enter student's english : ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math : ");
        int math = scanner.nextInt();

        Student stu1 = new Student(name, english, math);
        stu1.print();
    }
}
