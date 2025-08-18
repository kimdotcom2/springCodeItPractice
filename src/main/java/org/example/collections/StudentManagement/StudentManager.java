package org.example.collections.StudentManagement;

import java.util.*;

public class StudentManager {

    private List<Student> students;
    private Set<String> studentNames;
    private Map<String, Integer> scoreMap;

    public StudentManager() {
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score) {

        if (studentNames.contains(student.getName())) {
            System.out.println("Student name already exists.");
            return;
        }

        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);

        System.out.println("Student added: " + student.getName());
    }

    public void removeStudent(String name) {

        if (!studentNames.contains(name)) {
            System.out.println("Student name not found.");
            return;
        }


        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }

        }

        studentNames.remove(name);
        scoreMap.remove(name);

        System.out.println("Student removed: " + name);

    }

    public void printAllStudents() {

        for (Student student : students) {
            System.out.println(student.getName() + " : " + student.getAge() + "4 : " + student.getStudentId());
        }

    }

    public void printScore(String name) {

        if (!studentNames.contains(name)) {
            System.out.println("Student name not found.");
            return;
        }

        System.out.println(name + " : " + scoreMap.get(name));

    }

}
