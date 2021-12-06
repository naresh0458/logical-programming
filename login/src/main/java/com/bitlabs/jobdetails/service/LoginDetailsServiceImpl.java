package com.bitlabs.jobdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.jobdetails.entity.Users;
import com.bitlabs.jobdetails.repository.UserDetailsRepositoryInterface;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsServiceInterface {
	
	

	@Autowired
	private UserDetailsRepositoryInterface lri;
	
	@Override
	public boolean userLoginDetalis(String lid, String lpwd) {
		boolean b=false;
		List<Users> user=lri.findAll();
         for(Users u:user) {
			if(u.getUsername().equals(lid)&& u.getPassword().equals(lpwd))
				b=true;

		}
         return b;
	}

	@Override
	public Users saveUser(Users user) {
		
		return lri.save(user);
	}

	@Override
	public Users getUserByUsername(String username) {
		
		return lri.getUserByUsernameIgnoreCase(username);
	}

	@Override
	public List<Users> getUserByUsersname(String username) {
		
		return lri.getUsersByUsername(username);
	}

	@Override
	public List<Users> getAllUsers() {
		
		return lri.findAll();
	}
	
}
