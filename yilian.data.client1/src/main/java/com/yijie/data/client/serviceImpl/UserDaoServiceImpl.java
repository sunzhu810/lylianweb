package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.UserMapper;
import com.yijie.data.client.model.User;
import com.yijie.data.client.service.UserDaoService;

@Service
public class UserDaoServiceImpl implements UserDaoService {
	
	@Autowired
	private  UserMapper userMapper;

	@Override
	public User userLogin(User user) {
		try {
			List<User> users = userMapper.userSelect(user);
			if(users.size() == 0){
				return null;
			}else{
				return users.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List queryUser() {
		User user=new User();
		user.setId(1);
		return userMapper.userSelect(user);
	}
	

}
