package com.jobsearchsystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobsearchsystem.entity.Employer;
import com.jobsearchsystem.entity.Job;
import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.exception.EmployerAlreadyExistException;
import com.jobsearchsystem.exceptions.JobNotFoundException;
import com.jobsearchsystem.model.EmployerDTO;
import com.jobsearchsystem.model.JobDTO;
import com.jobsearchsystem.repository.EmployerRepository;
import com.jobsearchsystem.repository.JobRepository;
import com.jobsearchsystem.repository.UserRepository;
import com.jobsearchsystem.service.EmployerService;
import com.jobsearchsystem.util.Converter;
 

@Service 
public class EmployerServiceImpl implements EmployerService{

	@Autowired
	private EmployerRepository employerRepo;
	
	@Autowired
	private Converter converter;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private JobRepository jobRepo;
	
	@Override
	public String registerEmployer(EmployerDTO employerDTO) {
		String message=null;
		Employer employer=null;
		if(this.userRepo.existsByUserName(employerDTO.getUserName())) {
			throw new EmployerAlreadyExistException("user with given userName already exist");
		}
		employer=employerRepo.save(converter.convertToEmployerEntity(employerDTO));
		if(employer !=null) {
			message="Registration successfull";
		}
		return message;
	}

	@Override
	public User loginEmployer(String userName, String password) {
	 System.out.println(userName+""+password);
	 User user=userRepo.findByUserNameAndPassword(userName, password);
	return user;
	}

	@Override
 	public  Job postJob( JobDTO jobDTO) {
 		 return jobRepo.save(converter.convertToJobEntity(jobDTO));
 	}
  
@Override
 	public  Job editJob( JobDTO jobDTO) {
 		return jobRepo.save(converter.convertToJobEntity(jobDTO));
 }
	 
@Override
public List<Job> viewAllJobs() {
	return jobRepo.findAll();
}
@Override
public  Job deleteJobByJobId(int jobId) throws JobNotFoundException {
	Optional<Job> jobop = jobRepo.findById(jobId);
	Job job = null;
	if(jobop.isPresent()) {
		jobRepo.deleteById(jobId);
		job = jobop.get();
	}else {
		throw new JobNotFoundException("No such Job");
	}
	return job;
}
	
	 
 
}
