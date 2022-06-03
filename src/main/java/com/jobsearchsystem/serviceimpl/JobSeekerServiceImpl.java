package com.jobsearchsystem.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobsearchsystem.entity.JobSeeker;
import com.jobsearchsystem.entity.User;
import com.jobsearchsystem.exception.JobSeekerAlreadyExistsException;
import com.jobsearchsystem.model.JobSeekerDTO;
import com.jobsearchsystem.repository.JobSeekerRepository;
import com.jobsearchsystem.repository.UserRepository;
import com.jobsearchsystem.service.JobSeekerService;
import com.jobsearchsystem.util.Converter;

 
@Service 
public class JobSeekerServiceImpl implements JobSeekerService {
	@Autowired
	private JobSeekerRepository jobSeekerRepo;
	
	@Autowired
	private Converter converter;
	@Autowired
	private UserRepository userRepo;
	@Override
	public String registerJobSeeker(JobSeekerDTO jobSeekerDTO) {
		String message = null;
		JobSeeker jobSeeker = null;
	 if(this.userRepo.existsByUserName(jobSeekerDTO.getUserName())) {
		 throw new JobSeekerAlreadyExistsException("user with given userName already exist");
		 
			}
	 jobSeeker = jobSeekerRepo.save(converter.convertToJobSeekerEntity(jobSeekerDTO)) ;
	if(jobSeeker != null)
	{
		message = "Record Inserted Successfully";
	}
			return message ;
	}
		@Override
	public User loginJobSeeker(String userName, String password) {
	 System.out.println(userName+""+password);
	 User user=userRepo.findByUserNameAndPassword(userName, password);
	return user;
	}



		
}
	
	 
