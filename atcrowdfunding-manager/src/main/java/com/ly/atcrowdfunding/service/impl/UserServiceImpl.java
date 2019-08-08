package com.ly.atcrowdfunding.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.atcrowdfunding.dao.UserMapper;
import com.ly.atcrowdfunding.entity.User;
import com.ly.atcrowdfunding.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> queryAll() {
		return userMapper.queryAll();
	}

	public User query4Login(User user) {
		return userMapper.query4Login(user);
	}

	public List<User> pageQueryData(Map<String, Object> map) {
		return userMapper.pageQueryData(map);
	}

	public int pageQueryCount(Map<String, Object> map) {
		return userMapper.pageQueryCount(map);
	}

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public User queryById(Integer id) {
		return userMapper.queryById(id);
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	public void deleteUserById(Integer id) {
		userMapper.deleteUserById(id);
	}

	public void deleteUsers(Map<String, Object> map) {
		userMapper.deleteUsers(map);
	}

	public void deleteUserRoles(Map<String, Object> map) {
		userMapper.deleteUserRoles(map);
	}

	public void insertUserRoles(Map<String, Object> map) {
		userMapper.insertUserRoles(map);
	}

	public List<Integer> queryRoleidsByUserid(Integer id) {
		return userMapper.queryRoleidsByUserid(id);
	}
}