package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;
    
    @BeforeEach
    public void setUp() {
        student = new Student("Test", 20);
    }
    
    @Test
    public void testGetName() {
        assertEquals("Test", student.getName());
    }
    
    @Test
    public void testSetAge() {
        student.setAge(25);
        assertEquals(25, student.getAge());
    }
    
    @Test
    public void testSetAgeNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.setAge(-1);
        });
    }
    
    @Test
    public void testAddCourse() {
        student.addCourse("Math");
        assertEquals(1, student.getCourses().size());
        assertTrue(student.getCourses().contains("Math"));
    }
}
