package com.bitlabs.jobdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.jobdetails.entity.Jobs;
@Repository
public interface JobDetailsRepositoryInterface extends JpaRepository<Jobs, Long>{

}
