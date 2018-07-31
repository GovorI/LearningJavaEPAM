package com.company.chapter3;

import java.util.Scanner;

public class Sorting {
    public void sortingStudent() {
        Scanner sc = new Scanner(System.in);
        String answ1 = "1";
        String answ2 = "2";
        String answ3 = "3";
        String answ4 = "4";
        String answ5 = "5";

        while (true) {
            System.out.println("Select the type of sorting: 1 - the list of students of a given faculty\n" +
                               "                            2 - lists of students for each faculty and course\n" +
                               "                            3 - the list of students who were born after a specified year\n" +
                               "                            4 - a list of study groups\n" +
                               "                            5 - Exit\n");

            String answer = sc.next();
            if (answer.equalsIgnoreCase(answ1)) {
                System.out.println("The list of students of a given faculty");
            }
            if (answer.equalsIgnoreCase(answ2)) {
                System.out.println("Lists of students for each faculty and course");
            }
            if (answer.equalsIgnoreCase(answ3)) {
                System.out.println("The list of students who were born after a specified year");
            }
            if (answer.equalsIgnoreCase(answ4)) {
                System.out.println("A list of study groups");
            }
            if (answer.equalsIgnoreCase(answ5)) {
                //Exit
                break;
            }
        }
    }

}
