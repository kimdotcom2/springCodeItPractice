package org.example.objectorientedprogramming.ex4;

public class BusinessUser extends User{


    private String companyName;

    public BusinessUser(String userId, String name, String companyName) {
        super(userId, name);
        this.companyName = companyName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("Company Name: " + companyName);
    }
}
