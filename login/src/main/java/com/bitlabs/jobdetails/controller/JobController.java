package com.bitlabs.jobdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.jobdetails.entity.Jobs;
import com.bitlabs.jobdetails.service.JobServiceInterface;


@RestController
public class JobController {
	
	@Autowired
	private JobServiceInterface jsi;
	
	@PostMapping("/jobdetails")
	public Jobs saveJob(@RequestBody Jobs job)
	{
		return jsi.saveJobData(job);
	}
	
	@GetMapping("/jobdetails")
	public List<Jobs> getAllJobDetails(){
		return jsi.getJobDetails(); 
	}
	
	@DeleteMapping("/jobdetail/{id}")
	 public String deleteJobDetails(@PathVariable("id") long jid) {
			
			jsi.deleteJobDetails(jid);
			return "Deleted Successfully";
		}
	
	@PutMapping("/jobdetail/{id}")
	public Jobs updateJobDetails(@PathVariable("id")long jid,@RequestBody Jobs jobdetail) {
		
		return jsi.updateEmployee(jid,jobdetail);
	
	}
		

}
