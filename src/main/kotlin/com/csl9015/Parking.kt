package com.csl9015

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2019, 6, 28, 8, 30, 30)
    val leave = LocalDateTime.of(2019, 6, 28, 12, 38, 30)
    var car = Car("QK-0366", enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration() / 60.0).toLong()
    println(hours)
}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }

    fun duration() = Duration.between(enter, leave).toMinutes()
}