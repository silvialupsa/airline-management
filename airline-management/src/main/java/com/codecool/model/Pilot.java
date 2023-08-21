package com.codecool.model;

import com.codecool.enums.PilotType;

import java.time.LocalDate;

public class Pilot extends AirlineEmployee {
    private PilotType pilotType;
    private final boolean hasAnalogCompass;

    public Pilot(String name, LocalDate birthDate, PilotType pilotType, String phoneNumber, double salary, boolean hasAnalogCompass) {
        super(name, birthDate, phoneNumber, salary);
        this.pilotType = pilotType;
        this.hasAnalogCompass = hasAnalogCompass;
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public void setPilotType(PilotType pilotType) {
        this.pilotType = pilotType;
    }

    public boolean hasAnalogCompass() {
        return hasAnalogCompass;
    }

    @Override
    boolean isReadyToFly() {
        return true;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "pilotType=" + pilotType +
                ", hasAnalogCompass=" + hasAnalogCompass +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
