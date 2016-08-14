package com.ab.data.gov.apiInterface.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
	private String help;
	private Boolean success;
	private int totalRecords;
	private int count;
	private TrainTimeTable[] records;
	
	/**
	 * @return the help
	 */
	public String getHelp() {
		return help;
	}
	
	/**
	 * @param help the help to set
	 */
	@JsonProperty("help")
	public void setHelp(String help) {
		this.help = help;
	}
	
	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}
	
	/**
	 * @param success the success to set
	 */
	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	/**
	 * @return the totalRecords
	 */
	public int getTotalRecords() {
		return totalRecords;
	}
	
	/**
	 * @param totalRecords the totalRecords to set
	 */
	@JsonProperty("total_records")
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * @param count the count to set
	 */
	@JsonProperty("count")
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * @return the records
	 */
	public TrainTimeTable[] getRecords() {
		return records;
	}
	
	/**
	 * @param records the records to set
	 */
	@JsonProperty("records")
	public void setRecords(TrainTimeTable[] records) {
		this.records = records;
	}
}
