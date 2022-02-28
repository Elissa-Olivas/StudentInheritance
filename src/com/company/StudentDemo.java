package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        List<String> student2Instruments = new ArrayList<>();
        student2Instruments.add("oboe");
        student2Instruments.add("trumpet");

        List<String> student3Instruments = new ArrayList<>();
        student3Instruments.add("piano");
        student3Instruments.add("french horn");
        student3Instruments.add("guitar");


	Student student1 = new Student("Billy", 1234);


        BandMember student2 = new BandMember("Leila", 4321, student2Instruments, 40);
        BandMember student3 = new BandMember("Amanda", 7890, student3Instruments, 80);

    student1.showStudent();
    student2.showStudent();
    student3.showStudent();

    }
}
