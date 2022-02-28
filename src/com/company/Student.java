package com.company;

public class Student {
    private String name;
    private int idNumber;

//    public void setIdNumber(int idNumber) {
//        this.idNumber = idNumber;
//    }

    public int getIdNumber() {
        return idNumber;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
    public String getName() {
        return name;
    }

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public void showStudent() {
        System.out.println("Student: " + name + ", " + idNumber);
    }
}
