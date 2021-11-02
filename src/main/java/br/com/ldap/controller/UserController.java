package br.com.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ldap.entity.User;
import br.com.ldap.exception.InfoException;
import br.com.ldap.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserServiceImpl userServiceImpl;

	public UserController(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	@GetMapping("/searchForUser/{username}")
	public User serachForUser(@PathVariable String username) throws InfoException {
		return this.userServiceImpl.search(username);

	}

}
