package org.example.objectorientedprogramming.ex1;

class Student {
    String name;
    int mathScore;
    int englishScore;
    int scienceScore;

    Student(String name, int mathScore, int englishScore, int scienceScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.scienceScore = scienceScore;
    }

    double getAverage() {
        return (this.mathScore + this.englishScore) / 2.0;
    }

}

public class OOPGradeManager {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Alice", 90, 95, 60),
                new Student("Bob", 80, 75, 100),
                new Student("Charlie", 85, 88, 72)
        };

        for (Student student : students) {
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
        }

    }

}
