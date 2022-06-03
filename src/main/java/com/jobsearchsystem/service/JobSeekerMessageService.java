package com.jobsearchsystem.service;

import java.util.List;

import com.jobsearchsystem.entity.JobSeekerMessage;
import com.jobsearchsystem.exception.RecordNotFoundException;
import com.jobsearchsystem.model.JobSeekerMessageDTO;

public interface JobSeekerMessageService {
	
	
    public String postJobSeekerMessage(JobSeekerMessageDTO jobSeekerMessageDTO) throws RecordNotFoundException;
	public JobSeekerMessage updateJobSeekerMessage(JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException;
	public JobSeekerMessage deleteJobSeekerMessage(JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException; 
	


	public JobSeekerMessage viewMessageRecievedById(int messageId) throws RecordNotFoundException;
	public List<JobSeekerMessage> viewAllJobSeekerMessages() throws RecordNotFoundException;
	
	
}

