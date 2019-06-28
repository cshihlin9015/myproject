package com.csl9015

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String, Car?>()
    val enter = LocalDateTime.of(2019, 6, 28, 8, 0, 0)
    var car: Car? = Car("QK-0366", enter)
    parkingLot.put(car!!.id, car)
    car = Car("QG-0867", enter.plusMinutes(15))
    parkingLot.put(car.id, car)

    // car 1 leaving
    val leave = LocalDateTime.of(2019, 6, 28, 9, 0, 0)
    car = parkingLot.get("QK-0366")
    car?.leave = leave
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    // car 2 leaving
    car = parkingLot.get("QG-0867")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)

//    val list = listOf(5, 1, 2, 7)
//    println(list)
//    val scores= listOf(88,98,54,78)
//    for (score in scores){
//        println(score)
//    }
//    println(list.get(3))
//
//    var mutableList= mutableListOf(5,1,2,7)
//    mutableList.add(6)
//    println(mutableList)
}