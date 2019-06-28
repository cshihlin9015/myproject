package com.csl9015.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
        HashMap<String, String> stock = new HashMap<>();
        stock.put("2330", "台積電");
        stock.put("2317", "鴻海");
        System.out.println(stock);
        stock.put("2330", "TSMC");
        System.out.println(stock);
        System.out.println(stock.get("2330"));
        for (String key : stock.keySet()) {
            System.out.println(stock.get(key));
        }

    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        // 沒有排序的功能
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        //        ArrayList list = new ArrayList();
//        list.add(5);
//        list.add(4);
//        list.add("asd");
//        list.add(true);
//        System.out.println(list);
//        int n1 = (int) list.get(0);
//        String s=(String) list.get(2);

        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1); // 可放重複的資料
        System.out.println(list);
        int n1 = list.get(0);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(85, 25, 45, 90, 65);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        int[] scores = {85, 25, 45, 90, 65};
        System.out.println(scores);
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }
        for (int n : scores) {
            System.out.println(n);
        }
    }
}
