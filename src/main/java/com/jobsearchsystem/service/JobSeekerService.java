package com.jobsearchsystem.service;

import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.model.JobSeekerDTO;

public interface JobSeekerService {
	public String registerJobSeeker(JobSeekerDTO jobSeekerDTO);
	public User loginJobSeeker(String userName,String password);
	
	

}
