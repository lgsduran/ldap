package br.com.ldap.repository;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

import br.com.ldap.entity.User;

@Repository
public interface UserRepository extends LdapRepository<User> {
	
	User findByUsername(String username);

}
