package com.jobsearchsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsearchsystem.entity.EmployerMessage;

@Repository
public interface EmployerMessageRepository extends JpaRepository<EmployerMessage,Integer>{ 

}

