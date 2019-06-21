package com.csl9015

fun main(args: Array<String>) {
//    println("Hello Kotlin!!")
    val h = Human()
    val p = Person()
    h.hello()
    p.hello()
}

class Human {
    fun hello() {
        println("Hello Kotlin(*o*)!!")
    }
}