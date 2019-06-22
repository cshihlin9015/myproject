package com.csl9015.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage());
        if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }
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
