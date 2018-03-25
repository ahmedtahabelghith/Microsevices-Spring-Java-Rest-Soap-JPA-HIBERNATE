package com.time.metier;

import java.util.List;

import com.time.entities.User;

public interface UserMetier {

	public User saveUser(User u);
	public List<User> listUsers() ;
	
	public User updateUser (User u);
	void DeleteUser(int idCompte);
	void DeleteUser(User u);
	public User findOne(User u);
	public User getUser(int idCompte);
	
	

	
	
}
