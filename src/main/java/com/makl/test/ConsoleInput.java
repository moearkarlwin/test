package com.makl.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {

    private String getUserInput1() {
        try {
            System.out.println("Enter a name : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getUserInput2() {
        System.out.println("Enter a name : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

//    private String getUserInput3() {
//        System.out.println("Enter a name : ");
//        return System.console().readLine();
//    }

    public static void main(String[] args) {
        ConsoleInput ci = new ConsoleInput();
        System.out.println("You entered : " + ci.getUserInput1());
        System.out.println("-------------");
        System.out.println("You entered : " + ci.getUserInput2());
//        System.out.println("-------------");
//        System.out.println("You entered : " + ci.getUserInput3());
        Testing t = new Testing();
    }
}
