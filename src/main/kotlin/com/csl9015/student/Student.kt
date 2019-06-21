package com.csl9015.student

fun main(args: Array<String>) {
    val stuk1 = Studentk("Kent", 98, 95)
    stuk1.print()
}

class Studentk(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2)
    }
}