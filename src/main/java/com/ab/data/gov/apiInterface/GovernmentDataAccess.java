package com.ab.data.gov.apiInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.ab.data.gov.apiInterface.entities.ApiResponse;
import com.ab.data.gov.apiInterface.entities.TrainTimeTable;
import com.ab.data.gov.entities.Train;

public class GovernmentDataAccess {
	
	private static final Logger log = LoggerFactory.getLogger(GovernmentDataAccess.class);
	
	private static Boolean trainContains(List<Train> trains, Train train) {
		for (Train tempTrain : trains) {
			if (tempTrain.getTrainNumber().equals(train.getTrainNumber()) &&
					tempTrain.getTrainName().equals(train.getTrainName())) {
				return true;
			}
		}
		return false;
	}
	
	public static Collection<Train> GetTrains() {
		RestTemplate restTemplate = new RestTemplate();
		ApiResponse response =
				restTemplate.getForObject(
						"https://data.gov.in/api/datastore/resource.json?resource_id=b46200c1-ca9a-4bbe-92f8-b5039cc25a12&api-key=574cfe75dbb216592ad3419d97bfa16c",
						ApiResponse.class);
		
		List<Train> trains = new ArrayList<>(); 
		
		for (TrainTimeTable record : response.getRecords()) {
			
			Train train = new Train();
			train.setTrainNumber(record.getTrainNumber());
			train.setTrainName(record.getTrainName());
			
			if (!trainContains(trains, train)) {
				trains.add(train);
			}
		}
		
		return trains;
	}
	
	public static Collection<Train> GetTrains(int offset) {
		RestTemplate restTemplate = new RestTemplate();
		ApiResponse response =
				restTemplate.getForObject(
						"https://data.gov.in/api/datastore/resource.json?resource_id=b46200c1-ca9a-4bbe-92f8-b5039cc25a12&api-key=574cfe75dbb216592ad3419d97bfa16c&offset=" + offset,
						ApiResponse.class);
		
		List<Train> trains = new ArrayList<>(); 
		
		for (TrainTimeTable record : response.getRecords()) {
			
			Train train = new Train();
			train.setTrainNumber(record.getTrainNumber());
			train.setTrainName(record.getTrainName());
			
			if (!trainContains(trains, train)) {
				trains.add(train);
			}
		}
		
		return trains;
	}

	public static Collection<Train> GetAllTrains() {
		List<Train> trains = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		Integer offset = 0;
		Boolean continueFlag = true;
		
		log.info("Getting the list of trains from API");
		
		while (continueFlag) {
			
			log.info("Making api call for offset: " + offset.toString());
			ApiResponse response =
					restTemplate.getForObject(
							"https://data.gov.in/api/datastore/resource.json?resource_id=b46200c1-ca9a-4bbe-92f8-b5039cc25a12&api-key=574cfe75dbb216592ad3419d97bfa16c&offset=" + offset++,
							ApiResponse.class);
			
			if (response.getSuccess() &&
					response.getCount() > 0) {
				
				for (TrainTimeTable record : response.getRecords()) {
					
					Train train = new Train();
					train.setTrainNumber(record.getTrainNumber());
					train.setTrainName(record.getTrainName());
					
					if (!trainContains(trains, train)) {
						trains.add(train);
					}
				}
				
				continueFlag = false;
			} else {
				continueFlag = false;
			}
		}
		
		log.info("Total trains found: " + trains.size());
		
		return trains;
	}
}
