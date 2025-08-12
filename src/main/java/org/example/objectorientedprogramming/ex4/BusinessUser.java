package org.example.objectorientedprogramming.ex4;

public class BusinessUser extends User{

    private String email;
    private String companyName;

    public BusinessUser(String userId, String name, String email, String companyName) {
        super(userId, name);
        this.email = email;
        this.companyName = companyName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
        System.out.println("회사이름: " + companyName);
    }
}
