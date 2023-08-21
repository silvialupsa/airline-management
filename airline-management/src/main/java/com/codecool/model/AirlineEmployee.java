package com.codecool.model;

import java.time.LocalDate;

public abstract class AirlineEmployee {
    protected final String name;
    protected String phoneNumber;
    protected final LocalDate birthDate;
    protected double salary;


    protected AirlineEmployee(String name, LocalDate birthDate, String phoneNumber, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    abstract boolean isReadyToFly();

    @Override
    public String toString() {
        return "AirlineEmployee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
