package com.codecool;

import com.codecool.enums.Language;
import com.codecool.enums.PilotType;
import com.codecool.model.Flight;
import com.codecool.model.FlightAttendant;
import com.codecool.model.Pilot;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FlightAttendant flightAttendant1 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, true);
        flightAttendant1.addLanguage(Language.German);
        flightAttendant1.addLanguage(Language.Polish);
        flightAttendant1.addLanguage(Language.English);

        FlightAttendant flightAttendant2 = new FlightAttendant("name2", LocalDate.now(), "034853", 2000.0, false);
        flightAttendant2.addLanguage(Language.English);
        flightAttendant2.addLanguage(Language.Polish);

        FlightAttendant flightAttendant3 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, true);
        flightAttendant3.addLanguage(Language.English);

        FlightAttendant flightAttendant4 = new FlightAttendant("name1", LocalDate.now(), "034853", 2000.0, true);
        flightAttendant4.addLanguage(Language.English);

        Pilot pilot1 = new Pilot("pilot1", LocalDate.now(), PilotType.Pilot, "kvds", 5000.0, true, PilotType.Pilot, true);
        Pilot pilot2 = new Pilot("pilot2", LocalDate.now(), PilotType.Pilot, "kvds", 5000.0, false, PilotType.Pilot, true);
        Pilot pilot3 = new Pilot("pilot3", LocalDate.now(), PilotType.Pilot, "kvds", 5000.0, true, PilotType.Co_pilot, true);
        Pilot pilot4 = new Pilot("pilot3", LocalDate.now(), PilotType.Co_pilot, "kvds", 5000.0, true, PilotType.Co_pilot, true);

        List<Pilot> pilotList1 = new ArrayList<>();
        pilotList1.addAll(List.of(pilot1, pilot4 ));
        List<FlightAttendant> flightAttendantList1 = new ArrayList<>();
        flightAttendantList1.addAll(List.of(flightAttendant1, flightAttendant3, flightAttendant4));

        Flight flight1 = new Flight(1, Language.English, pilotList1, flightAttendantList1);

        flight1.checkFlight();

        List<Pilot> pilotList2 = new ArrayList<>();
        pilotList2.addAll(List.of(pilot1, pilot4, pilot3 ));
        List<FlightAttendant> flightAttendantList2 = new ArrayList<>();
        flightAttendantList2.addAll(List.of(flightAttendant2, flightAttendant3, flightAttendant4));

        Flight flight2 = new Flight(2, Language.Polish, pilotList2, flightAttendantList2);

        flight2.checkFlight();

    }
}