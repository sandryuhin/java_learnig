package ru.isys.trainings.task5.unit2;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {

    private String destination;
    private int flightNumber;
    private AirlineType airlineType;
    private LocalTime flightTime;
    private DayOfWeek[] daysOfWeeks;

    public enum AirlineType {
        CHARTER("Charter description"),
        REGULAR("Regular description");

        private final String description;

        AirlineType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AirlineType getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(AirlineType airlineType) {
        this.airlineType = airlineType;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(LocalTime flightTime) {
        this.flightTime = flightTime;
    }

    public DayOfWeek[] getDaysOfWeeks() {
        return daysOfWeeks;
    }

    public void setDaysOfWeeks(DayOfWeek[] daysOfWeeks) {
        this.daysOfWeeks = daysOfWeeks;
    }

}
