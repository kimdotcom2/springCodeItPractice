package org.example.collections.StudentManagement;

public class Student {

    private String name;
    private int age;

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
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int studentId;
    private int score;

    public Student(String name, int age, int studentId, int score) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.score = score;
    }


}
