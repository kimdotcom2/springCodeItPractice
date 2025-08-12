package org.example.objectorientedprogramming.ex4;

public class InheritanceTest {

    public static void main(String[] args) {

        User user = new PersonalUser("U001", "Alice", "alice@example.com");
        user.printUserInfo();

        User businessUser = new BusinessUser("U002", "Tokyo", "tokyo@gmail.com","Tokyo LLC");
        user.printUserInfo();

    }

}
