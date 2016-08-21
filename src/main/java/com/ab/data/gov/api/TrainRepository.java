/**
 * 
 */
package com.ab.data.gov.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ab.data.gov.entities.Train;

/**
 * @author root
 *
 */
public interface TrainRepository extends CrudRepository<Train, Long> {
	List<Train> findByTrainName(String trainName);
}
