package com.company;

import java.util.ArrayList;
import java.util.List;

public class BandMember extends Student {
    List<String> instruments = new ArrayList<>();
    private int minimumNumberOfPracticeHours;

    public int getMinimumNumberOfPracticeHours() {
        return minimumNumberOfPracticeHours;
    }

    public BandMember(String name, int idNumber, List<String> newInstruments, int minimumNumberOfPracticeHours) {
        super(name, idNumber);
        instruments.addAll(newInstruments);
        this.minimumNumberOfPracticeHours = minimumNumberOfPracticeHours;
    }

    public void showStudent() {
        super.showStudent();
        System.out.println(getName() + " plays the " + instruments + " and is required to " +
                "play " + minimumNumberOfPracticeHours + " hours");
    }

}
