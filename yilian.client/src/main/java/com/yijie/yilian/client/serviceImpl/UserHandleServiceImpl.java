package com.yijie.yilian.client.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.UserDao;
import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.UserHandleService;


@Service
public class UserHandleServiceImpl implements UserHandleService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User userLogin(User user) {
		User u = userDao.userLogin(user);
		System.err.println(u);
		return u;
	}

	@Override
	public Integer userRegist(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer userPhoneExist(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer userUpdate(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
