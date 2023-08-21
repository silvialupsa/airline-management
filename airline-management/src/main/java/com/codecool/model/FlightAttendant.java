package com.codecool.model;

import com.codecool.enums.Language;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightAttendant extends AirlineEmployee{
    private List<Language> languageList;


    public FlightAttendant(String name, LocalDate birthDate, String phoneNumber, double salary, boolean isReadyToFly) {
        super(name, birthDate,phoneNumber, salary, isReadyToFly);
        this.languageList = new ArrayList<>();
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public void addLanguage(Language language){
        languageList.add(language);
    }


    @Override
    public String toString() {
        return "FlightAttendant{" +
                "languageList=" + languageList +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", isReadyToFly=" + isReadyToFly +
                ", salary=" + salary +
                '}';
    }


}
