package com.codecool.model;

import com.codecool.enums.Language;

import java.util.*;

public class Flight {
    private Random random = new Random();
    private int id;
    private Language language;
    private List<Pilot> pilotList;
    private List<FlightAttendant> flightAttendantList;

    private final int numberOfPassengers;

    public Flight(int id, Language language, List<Pilot> pilotList, List<FlightAttendant> flightAttendantList) {
        this.id = id;
        this.language = language;
        this.pilotList = pilotList;
        this.numberOfPassengers = random.nextInt(250-100)+100 ;
        this.flightAttendantList = flightAttendantList;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Pilot> getPilotList() {
        return pilotList;
    }

    public void setPilotList(List<Pilot> pilotList) {
        this.pilotList = pilotList;
    }

    public List<FlightAttendant> getFlightAttendantList() {
        return flightAttendantList;
    }

    public void setFlightAttendantList(List<FlightAttendant> flightAttendantList) {
        this.flightAttendantList = flightAttendantList;
    }

    public void addFlightAttendant(FlightAttendant flightAttendant){
        flightAttendantList.add(flightAttendant);
    }

    public void addPilot(Pilot pilot){
        pilotList.add(pilot);
    }

    private boolean checkNumberOfEmployees(){
        return flightAttendantList.size() == 3 && pilotList.size() == 2;
    }

    private boolean everyEmployeeIsReady(){
        long sizeOfFilteredFlightAttendance = flightAttendantList.stream()
                .filter(flightAttendant -> flightAttendant.isReadyToFly)
                .count();
        long sizeOfFilteredPilots = pilotList.stream()
                .filter(pilot -> pilot.isReadyToFly)
                .count();

        return sizeOfFilteredPilots == pilotList.size() && sizeOfFilteredFlightAttendance == flightAttendantList.size();
    }

    private boolean checkAnalogCompass(){
        long sizeOfFilteredPilots = pilotList.stream()
                .filter(Pilot::hasAnalogCompass)
                .count();
        return sizeOfFilteredPilots == pilotList.size();
    }

    private boolean checkNumberOFPassengers(){
        return numberOfPassengers < 220;
    }

    private boolean checkLanguage(){
        long sizeOfFilteredFlightAttendance = flightAttendantList.stream()
                .filter(flightAttendant -> flightAttendant.getLanguageList().contains(language))
                .count();

        return sizeOfFilteredFlightAttendance == flightAttendantList.size();
    }

    public boolean checkFlight(){
        System.out.println("Flight number " + id);
        if(checkNumberOfEmployees() && everyEmployeeIsReady() && checkAnalogCompass() && checkNumberOFPassengers() && checkLanguage()){
            System.out.println("PASSED");
            return true;
        } else {
            System.out.println("FAILED:");
            if(!checkNumberOfEmployees()){
                System.out.println("Number of employees is not valid");
            }
            if(!everyEmployeeIsReady()){
                System.out.println("The employees are not ready");
            }
            if(!checkAnalogCompass()){
                System.out.println("The pilots do not have analog compass");
            }
            if(!checkNumberOFPassengers()){
                System.out.println("The number of passengers is not valid");
            }
            if(!checkLanguage()){
                System.out.println("Flight attendances do not speak the flight language");
            }
        }
        return false;
    }

}
