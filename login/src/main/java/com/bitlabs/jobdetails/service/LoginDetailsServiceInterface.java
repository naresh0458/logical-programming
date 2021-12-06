package com.bitlabs.jobdetails.service;

import java.util.List;

import com.bitlabs.jobdetails.entity.Users;

public interface LoginDetailsServiceInterface {

	boolean userLoginDetalis(String lid, String lpwd);

	Users saveUser(Users user);

	Users getUserByUsername(String username);

	List<Users> getUserByUsersname(String username);

	List<Users> getAllUsers();


}