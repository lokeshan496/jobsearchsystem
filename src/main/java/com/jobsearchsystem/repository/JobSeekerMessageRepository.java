package com.jobsearchsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsearchsystem.entity.JobSeekerMessage;

@Repository
public interface JobSeekerMessageRepository extends JpaRepository<JobSeekerMessage,Integer>{ 

}
