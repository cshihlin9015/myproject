package com.csl9015

fun main(args: Array<String>) {
//    println("Hello Kotlin!!")
    val h1 = Human(67f, 1.7f)
    val h2 = Human(weight = 70f, height = 1.75f)

    var s: String? = "qwert"
    s = null
    println(s?.length)
    println(s?.get(2))
    println(s?.substring(2))
}

class Human(var weight: Float, var height: Float, var name: String = "") {
    init {
        println("weight:$weight , height:$height ")
    }

//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun hello() {
        println("Hello Kotlin(*o*)!!")
    }

    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi
    }
}