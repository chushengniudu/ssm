package cn.temptation.dao;

import cn.temptation.entity.User;

public interface UserDao {
	public abstract User findByUsername(String username);
}