package com.jobsearchsystem.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.jobsearchsystem.entity.Employer;
import com.jobsearchsystem.entity.EmployerMessage;
import com.jobsearchsystem.entity.Job;
import com.jobsearchsystem.entity.JobSeeker;
import com.jobsearchsystem.entity.JobSeekerMessage;
import com.jobsearchsystem.model.EmployerDTO;
import com.jobsearchsystem.model.EmployerMessageDTO;
import com.jobsearchsystem.model.JobDTO;
import com.jobsearchsystem.model.JobSeekerDTO;
import com.jobsearchsystem.model.JobSeekerMessageDTO;

@Component
public class Converter {

	public Employer convertToEmployerEntity(EmployerDTO employerDTO) {
		Employer employer=new Employer();
		BeanUtils.copyProperties(employerDTO, employer);
		
		return employer;
	}
	
	public EmployerDTO convertToEmployerDTO(Employer employer) {
		EmployerDTO employerDTO=new EmployerDTO();
		BeanUtils.copyProperties(employer, employerDTO);
		
		return employerDTO;
	}
	
	public JobSeeker convertToJobSeekerEntity(JobSeekerDTO jobSeekerDTO) {
		JobSeeker jobSeeker=new JobSeeker();
		BeanUtils.copyProperties(jobSeekerDTO, jobSeeker);
		//
		List<JobSeekerMessageDTO> dtoMessages = jobSeekerDTO.getMessages();
		List<JobSeekerMessage>messages = new ArrayList<>();
		
		for(JobSeekerMessageDTO jobSeekerMessage : dtoMessages) {
			messages.add(convertToJobSeekerMessageEntity(jobSeekerMessage));
		}
		
		jobSeeker.setMessages(messages);
		
		return jobSeeker;
	}
	
	public JobSeekerDTO convertToJobSeekerDTO(JobSeeker jobSeeker) {
		JobSeekerDTO jobSeekerDTO=new JobSeekerDTO();
		BeanUtils.copyProperties(jobSeeker, jobSeekerDTO);
		
		List<JobSeekerMessage> messages = jobSeeker.getMessages();
		List<JobSeekerMessageDTO>dtoMessages = new ArrayList<>();
		
		for(JobSeekerMessage jobSeekerMessage : messages) {
			dtoMessages.add(convertToJobSeekerMessageDTO(jobSeekerMessage));
		}
		
		jobSeekerDTO.setMessages(dtoMessages);
		
		return jobSeekerDTO;
	}
	
	public JobSeekerMessage convertToJobSeekerMessageEntity(JobSeekerMessageDTO jobSeekerMessageDTO) {
		JobSeekerMessage jobSeekerMessage=new JobSeekerMessage();
		BeanUtils.copyProperties(jobSeekerMessageDTO, jobSeekerMessage);
		BeanUtils.copyProperties(jobSeekerMessageDTO.getEmployer(), jobSeekerMessage.getEmployer());
		
		return jobSeekerMessage;
	}
	
	public JobSeekerMessageDTO convertToJobSeekerMessageDTO(JobSeekerMessage jobSeekerMessage) {
		JobSeekerMessageDTO jobSeekerMessageDTO=new JobSeekerMessageDTO();
		BeanUtils.copyProperties(jobSeekerMessage, jobSeekerMessageDTO);
		BeanUtils.copyProperties(jobSeekerMessage.getEmployer(), jobSeekerMessage.getEmployer());
		
		return jobSeekerMessageDTO;
	}
	
	public EmployerMessage convertToEmployerMessageEntity(EmployerMessageDTO employerMessageDTO) {
		EmployerMessage employerMessage=new EmployerMessage();
		BeanUtils.copyProperties(employerMessageDTO, employerMessage);
		BeanUtils.copyProperties(employerMessageDTO.getJobSeekerDTO(), employerMessage.getJobSeeker());
		
		return employerMessage;
	}
	
	public EmployerMessageDTO convertToEmployerMessageDTO(EmployerMessage employerMessage) {
		EmployerMessageDTO employerMessageDTO=new EmployerMessageDTO();
		BeanUtils.copyProperties(employerMessage, employerMessageDTO);
		BeanUtils.copyProperties(employerMessage.getJobSeeker(), employerMessageDTO.getJobSeekerDTO());
		
		return employerMessageDTO;
	}
	
	public Job convertToJobEntity(JobDTO jobDTO) {
		Job job = new Job();
		
		BeanUtils.copyProperties(jobDTO, job);
		
		return job;
	}
	
	public JobDTO convertToJobDTO(Job job) {
		JobDTO jobDTO = new JobDTO();
		
		BeanUtils.copyProperties(job, jobDTO);
		
		return jobDTO;
	}
	public EmployerMessage convertToEmployerMessageEntity1(EmployerMessageDTO employerMessageDTO) {
		EmployerMessage employerMessage=new EmployerMessage();
		BeanUtils.copyProperties(employerMessageDTO, employerMessage);
		return employerMessage;
	}
	public EmployerMessageDTO convertToEmployerMessageDTO1(EmployerMessage employerMessage) {
		EmployerMessageDTO employerMessageDTO=new EmployerMessageDTO();
		BeanUtils.copyProperties(employerMessage, employerMessageDTO);
		return employerMessageDTO;
	 
	 }
}