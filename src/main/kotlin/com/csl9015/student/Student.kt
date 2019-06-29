package com.csl9015.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()

    Studentk.pass = 50
    val stuk = Studentk("Kent", 20, 95)
    val stuk1 = Studentk("Wed", 80, 85)
    val stuk2 = Studentk("Willy", 90, 95)
    stuk.print()
    stuk1.print()
    stuk2.print()

    val test = "123"
    println("Test is $test")
    println("High score : ${stuk.highest()}")

    // 研究生
    val gstuk = GraduateStudentk("Ryan", 95, 88, 10)
    gstuk.print()
}

class GraduateStudentk(name: String?, english: Int, math: Int, var thesis: Int) : Studentk(name, english, math) {
    companion object {
        val pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun getAverage() = (english + math + thesis) / 3

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Studentk(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass = 60

        fun test() {
            println("testing")
        }
    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    //    fun grading(): Char {
////        var grading = when (getAverage()) {
////            in 90..100 -> 'A'
////            in 80..89 -> 'B'
////            in 70..79 -> 'C'
////            in 60..69 -> 'D'
////            else -> 'F'
////        }
////        return grading
//        return when (getAverage()) {
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//        }
//    }
    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    open fun getAverage() = (english + math) / 2
    //    fun getAverage(): Int {
//        return (english + math) / 2
//    }

    fun highest() = if (math > english) {
        println("math")
        math
    } else {
        println("english")
        english
    }
//    fun highest(): Int {
//        var max = if (math > english) {
//            println("math")
//            math
//        } else {
//            println("english")
//            english
//        }
//        return max
//    }

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

