package com.csl9015.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                ((getAverage() >= pass) ? "PASS" : "FAILED"));
//        if (getAverage() >= 60) {
//            System.out.println("\tPASS");
//        } else {
//            System.out.println("\tFAILED");
//        }
        int average = getAverage();
        char grading = 'F';
        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t" + grading);
    }

    public int getAverage() {
        return (english + math) / 2;
    }

    public int highest() {
//        int max = (math > english) ? math : english;
//        if (math > english) {
//            max = math;
//        } else {
//            max = english;
//        }
        return (math > english) ? math : english;
    }


}
