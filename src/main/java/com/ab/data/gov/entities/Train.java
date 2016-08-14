package com.ab.data.gov.entities;

/**
 * Train entity
 * @author abhil
 *
 */
public class Train {
	/**
	 * Train Number that is unique
	 */
	private String trainNumber;
	
	/**
	 * Train Name that is unique
	 */
	private String trainName;

	/**
	 * @return the trainNumber
	 */
	public String getTrainNumber() {
		return trainNumber;
	}

	/**
	 * @param trainNumber the trainNumber to set
	 */
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
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
}
