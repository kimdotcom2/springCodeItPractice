package org.example.objectorientedprogramming.ex6;

import java.io.*;

public class IOExceptionTest {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("dsdsf.txt"))){
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
