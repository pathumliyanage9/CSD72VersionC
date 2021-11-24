package com.company;

public class Main {

    public static void main(String[] args) {
        int mk1 = 67;
        int mk2 = 99;
        int mk3 = 99;
        int total = mk1 + mk2 + mk3;
        int avg = total / 3;
        String grade;

        if (avg >= 50){
            grade = "Pass";
        }else {
            grade = "Fail";
        }

        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        System.out.println("Grade : "+grade);

    }
}
