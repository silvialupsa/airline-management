package com.codecool.model;

import com.codecool.enums.Language;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightAttendant extends AirlineEmployee {
    private List<Language> languageList;
    private Language flightLanguage;


    public FlightAttendant(String name, LocalDate birthDate, String phoneNumber, double salary, Language flightLanguage) {
        super(name, birthDate, phoneNumber, salary);
        this.languageList = new ArrayList<>();
        this.flightLanguage = flightLanguage;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public void addLanguage(Language language) {
        languageList.add(language);
    }


    @Override
    boolean isReadyToFly() {
        return true;
    }

    @Override
    public String toString() {
        return "FlightAttendant{" +
                "languageList=" + languageList +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }


}
