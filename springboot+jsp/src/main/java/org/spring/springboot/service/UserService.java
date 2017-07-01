package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.User;

public interface UserService {

	/**
	 * 通过部门id获取用户列表
	 * @param id
	 * @return
	 */
	List<User> findUserByDepId(Long id);
	
	int insert(User record);
}
