package com.csl9015

import java.util.*

fun main(args: Array<String>) {
    var secret = Random().nextInt(20) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    var number = 0

    for (i in 1..4) {
        print("Please enter a number ($i/4): ")
        number = scanner.nextInt()
        println("第${i}次$number")

        if (number < secret) {
            println("higher")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Great,the number is $number")
            break
        }
    }
}