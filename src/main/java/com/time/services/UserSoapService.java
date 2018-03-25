package com.time.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.time.dao.UserRepository;
import com.time.entities.User;
import com.time.metier.UserMetier;


@Component
@WebService
public class UserSoapService {
@Autowired
	private UserMetier userMetier ;



@WebMethod
public User saveUser(@WebParam User u) {
	return userMetier.saveUser(u);
}
@WebMethod
public List<User> listUsers() {
	return userMetier.listUsers();
}
@WebMethod
public User updateUser(User u) {
	return userMetier.updateUser(u);
}
@WebMethod
public void DeleteUser(@WebParam (name="id")int idCompte) {
	userMetier.DeleteUser(idCompte);
}

@WebMethod
public User findOne(User u) {
	return userMetier.findOne(u);
}
@WebMethod
public User getUser( @WebParam (name="id") int idCompte) {
	return userMetier.getUser(idCompte);
}
	
	
	
}
