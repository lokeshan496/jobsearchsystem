package com.jobsearchsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsearchsystem.entity.JobSeekerMessage;
import com.jobsearchsystem.exception.RecordNotFoundException;
import com.jobsearchsystem.model.JobSeekerMessageDTO;
import com.jobsearchsystem.service.JobSeekerMessageService;


@RestController
@CrossOrigin(origins = "http://localhost")
public class JobSeekerMessageController {
	
	
	@Autowired
	private JobSeekerMessageService jobSeekerMessageService;
	
	
	 

	 @PostMapping(value="/postJobSeekerMessage")
	public String postJobSeekerMessage (@RequestBody JobSeekerMessageDTO jobSeekerMessageDTO) throws RecordNotFoundException{
		return jobSeekerMessageService.postJobSeekerMessage(jobSeekerMessageDTO);
	}
	@PutMapping(value="/updateJobSeekerMessage")
	public JobSeekerMessage updateJobSeekerMessage(@RequestBody JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException{
		return jobSeekerMessageService.updateJobSeekerMessage(jobSeekerMessage);
	}
	@DeleteMapping(value="/deleteJobSeekerMessage")
	public JobSeekerMessage deleteJobSeekerMessage(@RequestBody JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException{
		return jobSeekerMessageService.deleteJobSeekerMessage(jobSeekerMessage);
	}
	
	@GetMapping(value="/viewAllJobSeekerMessages")
	public List<JobSeekerMessage> viewAllJobSeekerMessages() throws RecordNotFoundException{
		return jobSeekerMessageService.viewAllJobSeekerMessages();
	}
	@GetMapping(value="/viewMessageSentByJobSeeker")
	public List<JobSeekerMessage>viewMessageSentByJobSeeker() throws RecordNotFoundException{
		return jobSeekerMessageService.viewAllJobSeekerMessages();
	}
	@GetMapping(value="/viewMessageRecievedById/{jobSeekerMessageId}")
	public List<JobSeekerMessage>viewMessageRecievedById() throws RecordNotFoundException{
		return jobSeekerMessageService.viewAllJobSeekerMessages();
	}
	
	@GetMapping(value="/viewMessageSendToEmployerById/{jobSeekerMessageId}")
	public List<JobSeekerMessage>viewMessageSendToEmployerById() throws RecordNotFoundException{
		return jobSeekerMessageService.viewAllJobSeekerMessages();
	}

	@GetMapping(value="/viewMessageRecievedEmployer")
	public List<JobSeekerMessage>viewMessageRecievedEmployer() throws RecordNotFoundException{
		return jobSeekerMessageService.viewAllJobSeekerMessages();
	}

}
