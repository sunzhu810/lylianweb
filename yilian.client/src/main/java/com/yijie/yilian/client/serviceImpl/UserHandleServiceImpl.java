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
		return userDao.userRegist(user);
	}

	@Override
	public User userPhoneExist(String num) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setNum(num);
	User user1	=userDao.userLogin(user);
		return user1;
	}

	@Override
	public Integer userUpdate(User user) {
		return userDao.userUpdate(user);
	}

}
