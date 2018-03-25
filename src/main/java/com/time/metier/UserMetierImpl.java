package com.time.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.dao.UserRepository;
import com.time.entities.User;


@Service
public class UserMetierImpl implements UserMetier{
	
	@Autowired
	
private UserRepository userRepository ;

	@Override
	public User saveUser(User u) {
		
	
		return userRepository.save(u);
	}

	@Override
	public List<User> listUsers() {
		
		
		return userRepository.findAll();
	}

	
	
	

	@Override
	public User updateUser(User u) {


		return userRepository.saveAndFlush(u);
	}

	

	@Override
	public void DeleteUser(int idCompte) {
		  userRepository.delete(idCompte);
		
		
	}

	@Override
	public User findOne(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int idCompte) {
		return userRepository.findOne(idCompte);
	}

	@Override
	public void DeleteUser(User u) {
		
		 userRepository.delete(u);
		
	}
	
}
