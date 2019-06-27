package com.csl9015;

import com.csl9015.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestScoreTest() {
        Student student = new Student("Willy", 80, 95);
        Assertions.assertEquals(95, student.highest());
    }

    @Test
    public void averageTest() {
        Student student = new Student("Kent", 98, 90);
        Assertions.assertEquals((98 + 90) / 2, student.getAverage());
    }
}
