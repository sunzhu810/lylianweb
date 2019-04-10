package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.User;

public interface UserDaoService {
	
	public User userLogin(User user);
   public List queryUser();
}
