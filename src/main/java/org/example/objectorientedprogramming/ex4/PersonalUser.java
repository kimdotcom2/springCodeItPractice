package org.example.objectorientedprogramming.ex4;

public class PersonalUser extends User{

    private String email;

    public PersonalUser(String userId, String name, String email) {
        super(userId, name);
        this.email = email;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("Email: " + email);
    }

}
