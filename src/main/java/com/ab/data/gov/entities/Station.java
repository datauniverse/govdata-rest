package com.ab.data.gov.entities;

/**
 * Station entity
 * @author abhil
 *
 */
public class Station {
	/**
	 * Station Code that is unique
	 */
	private String stationCode;
	
	/**
	 * Station Name
	 */
	private String stationName;

	/**
	 * @return the stationCode
	 */
	public String getStationCode() {
		return stationCode;
	}

	/**
	 * @param stationCode the stationCode to set
	 */
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
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
}
