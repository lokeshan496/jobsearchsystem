package com.jobsearchsystem.service;

import java.util.List;

import com.jobsearchsystem.entity.Job;
import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.exceptions.JobNotFoundException;
import com.jobsearchsystem.model.EmployerDTO;
import com.jobsearchsystem.model.JobDTO;

public interface EmployerService {
	
	public String registerEmployer(EmployerDTO employerDTO);
	public User loginEmployer(String userName,String password);
	public Job postJob(JobDTO jobDTO);
	public Job editJob(JobDTO jobDTO);
	public Job deleteJobByJobId(int JobId)throws JobNotFoundException;
	public List<Job> viewAllJobs();
}
