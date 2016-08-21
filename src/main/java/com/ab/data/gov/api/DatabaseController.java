package com.ab.data.gov.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ab.data.gov.entities.*;
import com.ab.data.gov.apiInterface.*;

@RestController
public class DatabaseController {
	
	private static Logger log = LoggerFactory.getLogger(DatabaseController.class);
	
	@Autowired
	private TrainRepository repository;
	
	public void Repository(TrainRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/loadTrains", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void loadTrains() {
		
		List<Train> trains = (List<Train>) GovernmentDataAccess.GetAllTrains();
		
		log.info("Beginning to load trains to the database");
		repository.save(trains);
		log.info("Loaded trains successfully");
	}
}
