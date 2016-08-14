package com.ab.data.gov.entities;

import java.util.Map;

/**
 * A collection of route that completes a journey
 * @author abhil
 *
 */
public class Journey {
	/**
	 * The complete trip of a train through a long route
	 */
	private Map<Integer, Route> trip;

	/**
	 * @return the trip
	 */
	public Map<Integer, Route> getTrip() {
		return trip;
	}

	/**
	 * @param trip the trip to set
	 */
	public void setTrip(Map<Integer, Route> trip) {
		this.trip = trip;
	}
}
