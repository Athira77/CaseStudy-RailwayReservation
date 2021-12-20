package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DetailsService;
import com.example.demo.model.TrainDetails;

@RestController
public class DetailsController {
	
	/* GuestUser */
	 @Autowired
	 DetailsService Service;
	 //User entering departure , destination ,date
	 @GetMapping("/traindetails/{dep1}/{des1}/{date}") 
	 public List<TrainDetails> getAllTrainDetails(@PathVariable String dep1,@PathVariable String des1,@PathVariable String date) {
		 
		return Service.getAllTrainDetails(dep1, des1, date);
	}
	 
	 
	 //for microservice to retrieve price
	 @GetMapping("/train/{id}")
		private TrainDetails gettrainDetails(@PathVariable String id) {
			return Service.getTrainDetailsByName(id);
		}
	
	
}

