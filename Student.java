package com.company.chapter3;

//        Создать классы, спецификации которых приведены ниже. Определить конструкторы
//        и методы setТип(), getТип(), toString(). Определить дополнительно
//        методы в классе, создающем массив объектов. Задать критерий выбора данных
//        и вывести эти данные на консоль. В каждом классе, обладающем информацией,
//        должно быть объявлено несколько конструкторов.
//        1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
//        Факультет, Курс, Группа.
//        Создать массив объектов. Вывести:
//        a) список студентов заданного факультета;
//        b) списки студентов для каждого факультета и курса;
//        c) список студентов, родившихся после заданного года;
//        d) список учебной группы.


public class Student {
    private int id = 0;
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String add;
    private int phone;
    private String faculty;
    private int course;
    private int group;

    public void setId() {
        this.id += id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) { this.birthday = birthday; }

    public void setAddres(String addres) {
        this.add = addres;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddres() {
        return add;
    }

    public int getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }



    public Student() {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.add = add;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Surname: " + this.surname + " Name: " + this.name + " Patronymic: " + this.patronymic + " Birthday: " + this.birthday + " Home addres: " + this.add + " Phone: " + this.phone + " Faculty: " + this.faculty + " Course: " + this.course + " Group: " + this.group;
    }
}

