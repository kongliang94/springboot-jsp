package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.User;


public interface UserDao {

	List<User> findUserByDepId(Long id);
	
	int insert(User record);
}
