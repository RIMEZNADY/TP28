package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un étudiant
 */
public class Student {
    private String name;
    private int age;
    private List<String> courses;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    
    public void addCourse(String course) {
        if (course == null || course.isEmpty()) {
            return;
        }
        courses.add(course);
    }
    
    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }
    
    public double calculateAverage() {
        // Exemple de code smell : méthode non utilisée
        return 0.0;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", courses=" + courses.size() + "}";
    }
}
