package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.DetailsService;
import com.example.demo.model.TrainDetails;

@RestController
@RequestMapping("/admin") 
public class AdminController {
	
	 @Autowired
	 DetailsService Service;
	 
	 //Add new train details
	 
	  @PostMapping("/addTrain") 
	  public String savetrainDetails(@RequestBody TrainDetails e) 
	  { 
		  return Service.save(e);
		  
	  }
	  
	 @GetMapping("/ad")
	 public String admin() {
		 return "Hello admin";
	 }
	 
	 
        //trains available currently
	 
	    @GetMapping("/trainsavaliable")
		private List<TrainDetails> getAlltrainDetails() {
			return Service.getTrainDetails();
		}
		
		//Particular train data
		
		@GetMapping("/train/{id}")
		private TrainDetails gettrainDetails(@PathVariable String id) {
			return Service.getTrainDetailsByName(id);
		}
		
		

		@DeleteMapping("/deletetrain/{id}")
		private String deletetrainDetails(@PathVariable String id) {
			return Service.deleteTrainDetails(id);
		
		}
		
		@PutMapping("/updatetrain")  
		private TrainDetails update(@RequestBody TrainDetails data)   
		{  
		Service.saveOrUpdate(data);  
		return data;  
		}

}