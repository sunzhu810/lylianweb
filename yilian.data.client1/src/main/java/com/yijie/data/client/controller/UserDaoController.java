package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.User;
import com.yijie.data.client.service.UserDaoService;

@RestController
@RequestMapping("/user")
public class UserDaoController {

	@Autowired
	private UserDaoService userDaoService;
	
	@RequestMapping("/userLogin")
	public User userLogin(@RequestBody User user){
		System.err.println(user);
		User u = userDaoService.userLogin(user);
		System.err.println(u);
		return u;
	}
	@RequestMapping("/")
	public List query(){
		List u = userDaoService.queryUser();
		System.err.println(u.size());
		return u;
	}
	
}
