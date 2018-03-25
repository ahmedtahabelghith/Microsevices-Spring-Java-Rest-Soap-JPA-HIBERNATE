package com.time.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.time.entities.User;
import com.time.metier.UserMetier;

@RestController
public class UserRestService {
@Autowired
	private UserMetier  UserMetier;





@RequestMapping(value="/users",method=RequestMethod.POST)
public User saveUser(@RequestBody User u) {
	return UserMetier.saveUser(u);
}





@RequestMapping(value="/users",method=RequestMethod.GET)
public List<User> listUsers() {
	return UserMetier.listUsers();
}




@RequestMapping(value="/users/{id}",method=RequestMethod.GET)

public User getUser(@PathVariable (name="id") int idCompte) {
	System.out.println("Fetching & Deleting User with id " + idCompte);
	return UserMetier.getUser(idCompte);
	 
}


 
@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
public void DeleteUser(@PathVariable (name="id") int idCompte) {
	if (UserMetier == null) {
        System.out.println("Unable to delete. User with id " + idCompte + " not found");

    }
	 UserMetier.DeleteUser(idCompte);
	 
}




@RequestMapping(value="/users",method=RequestMethod.DELETE)
public void DeleteUser (User u) {
	 UserMetier.DeleteUser( u);

}
@RequestMapping(value="/users",method=RequestMethod.PUT)
public User updateUser(@RequestBody User u) {
	return UserMetier.updateUser(u);
}


}
