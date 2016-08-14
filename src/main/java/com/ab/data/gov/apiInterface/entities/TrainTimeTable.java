package com.ab.data.gov.apiInterface.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainTimeTable {
	private int id;
	private int timestamp;
	private String trainNumber;
	private String trainName;
	private int islNumber;
	private String stationCode;
	private String stationName;
	private String arrivalTime;
	private String departureTime;
	private int distance;
	private String sourceStationCode;
	private String sourceStationName;
	private String destinationStationCode;
	private String destinationStationName;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the timestamp
	 */
	public int getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	@JsonProperty("timestamp")
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * @return the trainNumber
	 */
	public String getTrainNumber() {
		return trainNumber;
	}
	
	/**
	 * @param trainNumber the trainNumber to set
	 */
	@JsonProperty("Train No.")
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}
	
	/**
	 * @param trainName the trainName to set
	 */
	@JsonProperty("train Name")
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	/**
	 * @return the islNumber
	 */
	public int getIslNumber() {
		return islNumber;
	}
	
	/**
	 * @param islNumber the islNumber to set
	 */
	@JsonProperty("islno")
	public void setIslNumber(int islNumber) {
		this.islNumber = islNumber;
	}
	
	/**
	 * @return the stationCode
	 */
	public String getStationCode() {
		return stationCode;
	}
	
	/**
	 * @param stationCode the stationCode to set
	 */
	@JsonProperty("station Code")
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	
	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return stationName;
	}
	
	/**
	 * @param stationName the stationName to set
	 */
	@JsonProperty("Station Name")
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	@JsonProperty("Arrival time")
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	
	/**
	 * @param departureTime the departureTime to set
	 */
	@JsonProperty("Departure time")
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
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
	@JsonProperty("Distance")
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	/**
	 * @return the sourceStationCode
	 */
	public String getSourceStationCode() {
		return sourceStationCode;
	}
	
	/**
	 * @param sourceStationCode the sourceStationCode to set
	 */
	@JsonProperty("Source Station Code")
	public void setSourceStationCode(String sourceStationCode) {
		this.sourceStationCode = sourceStationCode;
	}
	
	/**
	 * @return the sourceStationName
	 */
	public String getSourceStationName() {
		return sourceStationName;
	}
	
	/**
	 * @param sourceStationName the sourceStationName to set
	 */
	@JsonProperty("source Station Name")
	public void setSourceStationName(String sourceStationName) {
		this.sourceStationName = sourceStationName;
	}
	
	/**
	 * @return the destinationStationCode
	 */
	public String getDestinationStationCode() {
		return destinationStationCode;
	}
	
	/**
	 * @param destinationStationCode the destinationStationCode to set
	 */
	@JsonProperty("Destination station Code")
	public void setDestinationStationCode(String destinationStationCode) {
		this.destinationStationCode = destinationStationCode;
	}
	
	/**
	 * @return the destinationStationName
	 */
	public String getDestinationStationName() {
		return destinationStationName;
	}
	
	/**
	 * @param destinationStationName the destinationStationName to set
	 */
	@JsonProperty("Destination Station Name")
	public void setDestinationStationName(String destinationStationName) {
		this.destinationStationName = destinationStationName;
	}
}
