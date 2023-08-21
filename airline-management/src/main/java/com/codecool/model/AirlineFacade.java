package com.codecool.model;

import com.codecool.enums.Language;
import com.codecool.enums.PilotType;

import java.time.LocalDate;
import java.util.List;

public class AirlineFacade {
    private final FlightAttendant flightAttendant1;
    private final FlightAttendant flightAttendant2;
    private final FlightAttendant flightAttendant3;
    private final FlightAttendant flightAttendant4;
    private final Pilot pilot1;
    private final Pilot pilot2;
    private final Pilot pilot3;
    private final Pilot pilot4;

    public AirlineFacade() {
        flightAttendant1 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, Language.ENGLISH);
        flightAttendant1.addLanguage(Language.GERMAN);
        flightAttendant1.addLanguage(Language.POLISH);
        flightAttendant1.addLanguage(Language.ENGLISH);

        flightAttendant2 = new FlightAttendant("name2", LocalDate.now(), "034853", 2000.0, Language.ENGLISH);
        flightAttendant2.addLanguage(Language.ENGLISH);
        flightAttendant2.addLanguage(Language.POLISH);

        flightAttendant3 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, Language.ENGLISH);
        flightAttendant3.addLanguage(Language.ENGLISH);

        flightAttendant4 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, Language.ENGLISH);
        flightAttendant4.addLanguage(Language.ENGLISH);

        pilot1 = new Pilot("pilot1", LocalDate.now(), PilotType.PILOT, "kvds", 5000.0, true);
        pilot2 = new Pilot("pilot2", LocalDate.now(), PilotType.PILOT, "kvds", 5000.0, false);
        pilot3 = new Pilot("pilot3", LocalDate.now(), PilotType.PILOT, "kvds", 5000.0, true);
        pilot4 = new Pilot("pilot3", LocalDate.now(), PilotType.CO_PILOT, "kvds", 5000.0, true);
    }

    public void fly() {
        generateFlight(List.of(pilot3, pilot4), List.of(flightAttendant1, flightAttendant3, flightAttendant4), Language.ENGLISH);
        generateFlight(List.of(pilot1, pilot4, pilot3), List.of(flightAttendant2, flightAttendant3, flightAttendant4), Language.POLISH);
    }

    private void generateFlight(List<Pilot> pilotList, List<FlightAttendant> flightAttendantList, Language flightLanguage) {
        Flight flight1 = new Flight(1, flightLanguage, pilotList, flightAttendantList);
        flight1.checkFlight();
    }
}
