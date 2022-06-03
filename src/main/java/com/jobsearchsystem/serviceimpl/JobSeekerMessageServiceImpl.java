package com.jobsearchsystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobsearchsystem.entity.JobSeekerMessage;
import com.jobsearchsystem.exception.RecordNotFoundException;
import com.jobsearchsystem.model.JobSeekerMessageDTO;
import com.jobsearchsystem.repository.JobSeekerMessageRepository;
import com.jobsearchsystem.service.JobSeekerMessageService;
import com.jobsearchsystem.util.Converter;

@Service
public class JobSeekerMessageServiceImpl implements JobSeekerMessageService{

	@Autowired
    private JobSeekerMessageRepository jobseekermessageRepo;

    @Autowired
    private Converter converter;
    
	

	@Override
	public JobSeekerMessage viewMessageRecievedById(int messageId) throws RecordNotFoundException {
		java.util.Optional<JobSeekerMessage> jobSeekerMessage1 = jobseekermessageRepo.findById(messageId);
		JobSeekerMessage mess = null;
		if (jobSeekerMessage1.isPresent()) {
		mess = jobSeekerMessage1.get();
		} else {
		// if message not found it throw an exception
		throw new RecordNotFoundException("No such records");
		}

		return mess;
	}

	
		
	@Override
	public List<JobSeekerMessage> viewAllJobSeekerMessages() throws RecordNotFoundException {
		return jobseekermessageRepo.findAll();

	}



	@Override
	public String postJobSeekerMessage(JobSeekerMessageDTO jobSeekerMessageDTO) throws RecordNotFoundException {
		JobSeekerMessage jobSeekerMessage = converter.convertToJobSeekerMessageEntity(jobSeekerMessageDTO);
		String message = null;
		jobSeekerMessage = jobseekermessageRepo.save(jobSeekerMessage);
		
		
		
		if(jobSeekerMessage != null) {
			message = "Job Seeker's message posted successfully";
		}
		return message;
	}



	@Override
	public JobSeekerMessage updateJobSeekerMessage(JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException {
		
		jobSeekerMessage = jobseekermessageRepo.save(jobSeekerMessage);
		
		return jobSeekerMessage;
	}



	@Override
	public JobSeekerMessage deleteJobSeekerMessage(JobSeekerMessage jobSeekerMessage) throws RecordNotFoundException {
		jobseekermessageRepo.delete(jobSeekerMessage);
		return jobSeekerMessage;
	}
}