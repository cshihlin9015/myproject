package com.csl9015.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    //    private long enter;
    private LocalDateTime enter;
    //    private long leave;
    private LocalDateTime leave;

//    public Car(String id, long enter) {
//        this.id = id;
//        this.enter = enter;
//    }

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

//    public void leave() {
//        leave = System.currentTimeMillis();
//    }

    public void leave() {
        leave = LocalDateTime.now();
    }

//    public void setLeave(long leave) {
//        if (leave > enter) {
//            this.leave = leave;
//        }
//    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }

    public long getDuration() {
        Duration duration = Duration.between(enter, leave);
        return duration.toMinutes();
    }
}
