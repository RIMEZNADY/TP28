package com.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.addCourse("Math");
        student.addCourse("Java");
        
        System.out.println(student);
        
        // Exemple de code smell : variable non utilisée
        int unused = 42;
    }
}
