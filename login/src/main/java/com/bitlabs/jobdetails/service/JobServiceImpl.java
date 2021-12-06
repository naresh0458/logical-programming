package com.bitlabs.jobdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitlabs.jobdetails.entity.Jobs;
import com.bitlabs.jobdetails.repository.JobDetailsRepositoryInterface;


@Service
public class JobServiceImpl implements JobServiceInterface {

	@Autowired
    private JobDetailsRepositoryInterface jri;
	
	@Override
	public Jobs saveJobData(Jobs job) {
		
		return jri.save(job);
	}
	@Override
	public void deleteJobDetails(long jid) {
		
		jri.deleteById(jid);
	}
	@Override
	public List<Jobs> getJobDetails() {
		
		return jri.findAll();
	}
	@Override
	public Jobs updateEmployee(long jid, Jobs jobdetail) {
		
		Jobs jd=jri.findById(jid).get();
		return jri.save(jobdetail);
	}
	
	
    

}
