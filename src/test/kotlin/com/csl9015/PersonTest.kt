package com.csl9015.kotlin

import com.csl9015.Human
import com.csl9015.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest() {
        val human = Human(66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), human.bmi())
    }

    // Java
    @Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), person.bmi())
    }
}


