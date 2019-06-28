package com.csl9015.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2019, 6, 28, 8, 30, 30);
        LocalDateTime leave = LocalDateTime.of(2019, 6, 28, 10, 35, 30);
//        Car car = new Car("QK-0366", System.currentTimeMillis());

//        // 須將 enter 轉型成 long
//        Car car = new Car("QK-0366", enter.atZone(ZoneId.systemDefault()).toEpochSecond());

        Car car = new Car("QK-0366", enter);

//        car.setLeave(System.currentTimeMillis() + 1000 * 60 * 60 * 2);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration() / 60.0);
        System.out.println(hours);

//        java8();
//        java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant); // 格林威治的全球標準時間

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 當地時間

        // 自行定義時間格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));

        // 時間運算
        System.out.println(now.plus(Duration.ofHours(3)));

        // 自行定義時間
        LocalDateTime other = LocalDateTime.of(2019, 6, 28, 8, 30, 30);
        System.out.println(other);
    }

    private static void java() {
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
