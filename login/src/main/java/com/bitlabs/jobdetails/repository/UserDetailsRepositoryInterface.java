package com.bitlabs.jobdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.jobdetails.entity.Users;

@Repository
public interface UserDetailsRepositoryInterface extends JpaRepository<Users, Integer> {
	
	public Users getUserByUsernameIgnoreCase(String username);
	
	public List<Users> getUsersByUsername(String username);

}
