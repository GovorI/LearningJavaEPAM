package com.company.chapter3;

import java.util.ArrayList;
import java.util.Scanner;


public class DataEntry {

    ArrayList<Student> students = new ArrayList<>();

    public void initStudent() {
        Sorting sorting = new Sorting();
        Student student;

        Scanner sc = new Scanner(System.in);
        String answer1 = "YES";
        String answer2 = "NO";

        while (true) {
            System.out.println("Enter student? Choise YES or NO");
            String answ = sc.next();
            if (answer1.equalsIgnoreCase(answ)) {
                student = new Student();
                System.out.println("Enter surname: ");
                student.setSurname(sc.next());
                System.out.println("Enter name: ");
                student.setName(sc.next());
                System.out.println("Enter patronymic: ");
                student.setPatronymic(sc.next());
                System.out.println("Enter birthday: yyyy.mm.dd ");
                student.setBirthday(sc.next());
                System.out.println("Enter addres: ");
                student.setAddres(sc.next());
                System.out.println("Enter phone: ");
                student.setPhone(sc.nextInt());
                System.out.println("Enter faculty: ");
                student.setFaculty(sc.next());
                System.out.println("Enter course: ");
                student.setCourse(sc.nextInt());
                System.out.println("Enter group: ");
                student.setGroup(sc.nextInt());
                students.add(student);
                for (Student s : students) {
                    s.setId();
                }
            } else if (answer2.equalsIgnoreCase(answ)) {
                sorting.sortingStudent();
            }


        }
    }

    public void show() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

}