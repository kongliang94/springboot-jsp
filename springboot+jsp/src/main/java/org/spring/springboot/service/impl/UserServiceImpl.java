package org.spring.springboot.service.impl;

import java.util.List;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public List<User> findUserByDepId(Long id) {
		return userDao.findUserByDepId(id);
	}
	@Override
	public int insert(User record) {
		
		return userDao.insert(record);
	}
	

}
