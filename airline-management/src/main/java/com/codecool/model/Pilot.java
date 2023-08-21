package com.codecool.model;

import com.codecool.enums.Language;
import com.codecool.enums.PilotType;

import java.time.LocalDate;
import java.util.List;

public class Pilot extends AirlineEmployee {
    private PilotType pilotType;
    private final boolean hasAnalogCompass;
    public PilotType currentPosition;

    public Pilot(String name, LocalDate birthDate, PilotType pilotType,String phoneNumber, double salary, boolean hasAnalogCompass, PilotType currentPosition, boolean isReadyToFly) {
        super(name, birthDate,phoneNumber, salary, isReadyToFly);
        this.pilotType = pilotType;
        this.hasAnalogCompass= hasAnalogCompass;
        this.currentPosition = currentPosition;
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
    public String toString() {
        return "Pilot{" +
                "pilotType=" + pilotType +
                ", hasAnalogCompass=" + hasAnalogCompass +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
