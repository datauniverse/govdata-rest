package com.ab.data.gov.api;

import java.util.Collection;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ab.data.gov.apiInterface.GovernmentDataAccess;
import com.ab.data.gov.entities.Train;

/**
 * 
 * @author abhil
 *
 */
@RestController
public class TrainController {

	@RequestMapping(value = "/trains", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Train>> getTrains() {
		
		Collection<Train> trains = GovernmentDataAccess.GetTrains();
		return new ResponseEntity<Collection<Train>>(trains, HttpStatus.OK);
	}
}
