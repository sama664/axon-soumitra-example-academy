package com.soumitra.axon.axon_eample.command;

import lombok.Data;

@Data
// Command to schedule a flight
public class FlightScheduled {
    private final String flightId;
    private final String origin;
    private final String destination;

    public FlightScheduled(String flightId, String origin, String destination) {
        this.flightId = flightId;
        this.origin = origin;
        this.destination = destination;
    }


}
