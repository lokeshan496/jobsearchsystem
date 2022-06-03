package com.jobsearchsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobsearchsystem.entity.Job;
import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.exceptions.JobNotFoundException;
import com.jobsearchsystem.model.EmployerDTO;
import com.jobsearchsystem.model.JobDTO;
import com.jobsearchsystem.service.EmployerService;


@RestController
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	@PostMapping(value="/registerEmployer")
	public String registerEmployer(@RequestBody EmployerDTO employerDTO){
		return employerService.registerEmployer(employerDTO);
	}
	@PostMapping(value="/loginEmployer")
	 public User loginEmployer(@RequestBody EmployerDTO employerDTO ) {
	String userName=employerDTO.getUserName();
	String password=employerDTO.getPassword();
	return employerService.loginEmployer(userName, password);
	}
	@PostMapping(value="/postJob")
	public Job postJob(@RequestBody JobDTO jobDTO){
		return employerService.postJob(jobDTO);
	}
	@RequestMapping(value="/editjob")
	public  Job editJob(@RequestBody JobDTO jobDTO) {
		return  employerService.editJob(jobDTO);
	}
	@DeleteMapping(value="/deleteJob/{jobId}")
	public Job deleteJobByJobId(@RequestBody int jobId) throws JobNotFoundException {
		return employerService.deleteJobByJobId(jobId);
	}
	 
	@GetMapping(value="/viewAllJobs")
	public List<Job> viewAllJobs() {
		return employerService.viewAllJobs();
	}
 
	

}
 







