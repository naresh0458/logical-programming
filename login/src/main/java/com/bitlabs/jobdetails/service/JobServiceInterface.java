package com.bitlabs.jobdetails.service;

import java.util.List;

import com.bitlabs.jobdetails.entity.Jobs;

public interface JobServiceInterface {

	Jobs saveJobData(Jobs job);

	void deleteJobDetails(long jid);

	List<Jobs> getJobDetails();

	Jobs updateEmployee(long jid, Jobs jobdetail);

}
