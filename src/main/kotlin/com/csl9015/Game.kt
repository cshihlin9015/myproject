package com.csl9015

import java.util.*

fun main(args: Array<String>) {
    var secret = Random().nextInt(20) + 1
    println(secret)

    var number = 0
//    val scanner = Scanner(System.`in`)

    while (number != secret) {
        print("Please enter a number : ")
//        number = scanner.nextInt()
        number= readLine()!!.toInt()
        if (number < secret) {
            println("higher");
        } else if (number > secret) {
            println("lower");
        } else {
            println("Great,the number is $number");
        }
    }
}