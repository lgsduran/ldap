package br.com.ldap.service;

import org.springframework.stereotype.Service;

import br.com.ldap.entity.User;
import br.com.ldap.exception.InfoException;
import br.com.ldap.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User search(String username) throws InfoException {
		User ldap = this.userRepository.findByUsername(username);
		
		if (ldap == null) 
			throw new InfoException(String.format("Username %s not found!", username));

		return ldap;
	}

}
