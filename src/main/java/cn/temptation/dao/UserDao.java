package cn.temptation.dao;

import cn.temptation.entity.User;

public interface UserDao {
	User findByUsername(String username);
}