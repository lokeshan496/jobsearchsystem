package com.jobsearchsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jobsearchsystem.entity.JobSeeker;
import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.model.JobSeekerDTO;
import com.jobsearchsystem.service.JobSeekerService;

public class JobSeekerController {
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@PostMapping(value="/registerjobseeker")
	public String registerJobSeeker(@RequestBody JobSeekerDTO jobSeekerDTO){
		return jobSeekerService.registerJobSeeker(jobSeekerDTO);
	}
	@PostMapping(value="/loginJobSeeker")
	 public User loginJobSeeker(@RequestBody JobSeeker jobSeekerDTO ) {
	String userName=jobSeekerDTO.getUserName();
	String password=jobSeekerDTO.getPassword();
	return jobSeekerService.loginJobSeeker(userName, password);
	}
	 

}
