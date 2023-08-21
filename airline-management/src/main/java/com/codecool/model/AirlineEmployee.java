package com.codecool.model;

import com.codecool.enums.Language;

import java.time.LocalDate;
import java.util.*;

public abstract class AirlineEmployee {
    public final String name;
    public String phoneNumber;
    public final LocalDate birthDate;
    public boolean isReadyToFly;
    public double salary;


    protected AirlineEmployee(String name, LocalDate birthDate,String phoneNumber, double salary, boolean isReadyToFly) {
        this.name = name;
        this.birthDate = birthDate;
        this.isReadyToFly = isReadyToFly;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return "AirlineEmployee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", isReadyToFly=" + isReadyToFly +
                ", salary=" + salary +
                '}';
    }
}
