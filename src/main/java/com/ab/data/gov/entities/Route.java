package com.ab.data.gov.entities;

import java.sql.Time;

/**
 * Entity that joins exactly joins 2 stations with a train
 * @author abhil
 *
 */
public class Route {
	/**
	 * Train that travels between the 2 stations
	 */
	private Train train;
	
	/**
	 * Source Station that the train starts from
	 */
	private Station sourceStation;
	
	/**
	 * Destinations Station that the train reaches to
	 */
	private Station destinationStation;
	
	/**
	 * Departure time of the train from the source station
	 */
	private Time departure;
	
	/**
	 * Arrival Time of the train to the destination station
	 */
	private Time arrival;
	
	/**
	 * Distance the train covers in between the 2 stations
	 */
	private int distance;
	
	/**
	 * @return the train
	 */
	public Train getTrain() {
		return train;
	}
	
	/**
	 * @param train the train to set
	 */
	public void setTrain(Train train) {
		this.train = train;
	}
	
	/**
	 * @return the sourceStation
	 */
	public Station getSourceStation() {
		return sourceStation;
	}
	
	/**
	 * @param sourceStation the sourceStation to set
	 */
	public void setSourceStation(Station sourceStation) {
		this.sourceStation = sourceStation;
	}
	
	/**
	 * @return the destinationStation
	 */
	public Station getDestinationStation() {
		return destinationStation;
	}
	
	/**
	 * @param destinationStation the destinationStation to set
	 */
	public void setDestinationStation(Station destinationStation) {
		this.destinationStation = destinationStation;
	}
	
	/**
	 * @return the departure
	 */
	public Time getDeparture() {
		return departure;
	}
	
	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(Time departure) {
		this.departure = departure;
	}
	
	/**
	 * @return the arrival
	 */
	public Time getArrival() {
		return arrival;
	}
	
	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(Time arrival) {
		this.arrival = arrival;
	}
	
	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}
	
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}
}
