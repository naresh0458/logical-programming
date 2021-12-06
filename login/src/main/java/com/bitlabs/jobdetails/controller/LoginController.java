package com.bitlabs.jobdetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.jobdetails.entity.Users;
import com.bitlabs.jobdetails.service.LoginDetailsServiceInterface;


@CrossOrigin
@RestController
public class LoginController{
	
	@Autowired
	public LoginDetailsServiceInterface lsi;
	
	@GetMapping("/Logindetail/{username}/{password}")
	 public boolean userLoginDetails(@PathVariable("username") String lid,@PathVariable("password") String lpwd) {
			
			return lsi.userLoginDetalis(lid,lpwd);
	}
	
	@GetMapping("/allusers")
	public List<Users> getAllUsers(){
		return lsi.getAllUsers();
	}
	
	@PostMapping("/saveuser")
	public Users saveUser(@RequestBody Users u)
	{
		return lsi.saveUser(u);
	}
	
	@GetMapping("/getuserByName/{username}")
	public Users getUserByUsername(@PathVariable("username") String username) {
		return lsi.getUserByUsername(username);
	}

	@GetMapping("/getUserByNames/{username}")
	public java.util.List<Users> getUsersByUsername(@PathVariable("username") String username){
		return lsi.getUserByUsersname(username);
	}
	
}
		
