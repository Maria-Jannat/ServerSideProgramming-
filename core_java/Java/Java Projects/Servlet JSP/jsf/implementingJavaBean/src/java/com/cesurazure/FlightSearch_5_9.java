package com.cesurazure;

import java.util.ArrayList;
import java.util.List;

public class FlightSearch_5_9 {

    String origination;
    String destination;
    String departDate;
    String departTime;
    String returnDate;
    String returnTime;
    String tripType;
    ArrayList matchingFlights = new ArrayList();

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
        ((Flight_5_10) matchingFlights.get(0)).setOrigination(origination);
        ((Flight_5_10) matchingFlights.get(1)).setOrigination(origination);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        ((Flight_5_10) matchingFlights.get(0)).setDestination(destination);
        ((Flight_5_10) matchingFlights.get(1)).setDestination(destination);
        ((Flight_5_10) matchingFlights.get(0)).setFlightNum("133");
        ((Flight_5_10) matchingFlights.get(1)).setFlightNum("233");
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
        ((Flight_5_10) matchingFlights.get(0)).setDepartDate(departDate);
        ((Flight_5_10) matchingFlights.get(1)).setDepartDate(departDate);
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
        ((Flight_5_10) matchingFlights.get(0)).setDepartDate(departTime);
        ((Flight_5_10) matchingFlights.get(1)).setDepartDate(departTime);
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
        ((Flight_5_10) matchingFlights.get(0)).setReturnDate(returnDate);
        ((Flight_5_10) matchingFlights.get(1)).setReturnDate(returnDate);
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        ((Flight_5_10) matchingFlights.get(0)).setReturnTime(returnTime);
        ((Flight_5_10) matchingFlights.get(1)).setReturnTime(returnTime);
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public List getMatchingFlights() {
        return matchingFlights;
    }

    public void setMatchingFlights(List matchingFlights) {
        this.matchingFlights.addAll(matchingFlights);
    }

}
