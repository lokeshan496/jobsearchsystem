package com.jobsearchsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsearchsystem.entity.JobSeeker;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker,Integer>{


}
