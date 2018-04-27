package cn.temptation.service;

import cn.temptation.entity.User;

public interface UserService {

	/***
	 * 根据用户名查询User
	 * @param name
	 * @return
	 */
	public User findByUsername(String name) ;
}
