package br.com.ldap.service;

import br.com.ldap.entity.User;
import br.com.ldap.exception.InfoException;

public interface IUserService {
	
	User search(final String username) throws InfoException;

}
