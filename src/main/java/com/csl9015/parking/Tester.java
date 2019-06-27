package com.csl9015.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Date date = new Date(); // 表示目前時間
        System.out.println(date);
        System.out.println(date.getTime()); // 印出 long 值

        // 自訂時間格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        // 字串轉回變成 Java 的 Date 物件
        String s = "2019/06/27 08:00:00";
        Date other = null;
        try {
            // 因為不一定轉的成功
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(other);

        // 時間的運算
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 8);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());

    }
}
