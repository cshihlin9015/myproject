package com.csl9015.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();

//        Studentk.Companion.getPass();
        Studentk.getPass();

        Student.pass = 50;
        Student stu = new Student("Willy", 95, 100);
        Student stu1 = new Student("Tom", 55, 40);
        Student stu2 = new Student("Lisa", 95, 80);

        stu.print();
        stu1.print();
        stu2.print();

        System.out.println("High score : " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter student's name : ");
        String name = scanner.next();
        System.out.print("Please enter student's english : ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math : ");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score : " + stu.highest());
    }
}
