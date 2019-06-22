package com.csl9015.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stuk = Studentk("Kent", 90, 95)
    stuk.print()
    val test = "123"
    println("Test is $test")
    println("High score : ${stuk.highest()}")
}

class Studentk(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(
            name + "\t" + english + "\t" + math + "\t" + getAverage()+ "\t"
                    + if (getAverage() >= 60) "PASS" else "FAILED"
        )
    }

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun highest(): Int {
        var max = if (math > english) {
            println("math")
            math
        } else {
            println("english")
            english
        }
        return max
    }

    fun nameCheck() {
        println(name?.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name : ")
    var name = scanner.next()
    print("Please enter student's english : ")
    var english = scanner.nextInt()
    print("Please enter student's math : ")
    var math = scanner.nextInt()

    val stuk = Studentk(name, english, math)
    stuk.print()
    stuk.nameCheck()
}

