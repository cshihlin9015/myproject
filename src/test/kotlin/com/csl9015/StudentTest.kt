package com.csl9015.kotlin


import com.csl9015.student.Studentk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest() {
        val studentk = Studentk("Emly", 95, 88)
        Assertions.assertEquals(95, studentk.highest())
    }

    @Test
    fun averageTest() {
        val studentk = Studentk("Emly", 98, 88)
        Assertions.assertEquals((98 + 88) / 2, studentk.getAverage())
    }

    @Test
    fun gradingTest() {
        val studentk = Studentk("Emlt", 98, 88)
        Assertions.assertEquals('A', studentk.grading())
    }
}