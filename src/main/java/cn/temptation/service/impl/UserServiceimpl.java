package cn.temptation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.temptation.dao.UserDao;
import cn.temptation.entity.User;
import cn.temptation.service.UserService;

@Service
public class UserServiceimpl implements UserService{

	@Autowired
	UserDao dao;
	
	@Override
	public User findByUsername(String name) {
		User user=dao.findByUsername(name);
		return user;
	}

}
