package org.example.collections.StudentManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isFinished = false;
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(!isFinished) {

            System.out.print("1. 학생 등록\n" +
            "2. 학생 삭제\n" +
            "3. 학생 목록 보기\n" +
            "4. 학생 점수 조회\n" +
            "5. 종료\n" +
            "선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("이름 ");
                    String name = sc.next();
                    System.out.print("나이 ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("학번 ");
                    int studentUId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("점수: ");
                    int score = sc.nextInt();
                    sc.nextLine();

                    Student student = new Student(name, age, studentUId, score);
                    manager.addStudent(student, score);

                    System.out.println("학생 추가 : " + student);
                    break;
                case 2:
                    System.out.print("이름 ");
                    name = sc.next();
                    manager.removeStudent(name);
                    sc.nextLine();
                    System.out.println(name + " 삭제");
                    break;
                case 3:
                    manager.printAllStudents();
                    break;
                case 4:
                    System.out.print("이름 ");
                    name = sc.next();
                    manager.printScore(name);
                    break;
                default:
                    isFinished = true;
                    System.out.print("종료");
                    break;
            }



        }

    }

}
