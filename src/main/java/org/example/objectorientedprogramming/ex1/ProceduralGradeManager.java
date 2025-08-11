package org.example.objectorientedprogramming.ex1;

public class ProceduralGradeManager {

    public static void main(String[] args) {

        String[] studentNames = {"a", "b", "c", "d"};
        int[] mathScores = {100, 90, 80, 70};
        int[] englishScores = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            int total = mathScores[i] + englishScores[i];
            double average = total / 2.0;
            System.out.printf("%s 평균: %.1f\n", studentNames[i], average);
        }

    }

}
