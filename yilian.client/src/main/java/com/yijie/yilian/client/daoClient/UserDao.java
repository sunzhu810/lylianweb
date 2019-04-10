package com.yijie.yilian.client.daoClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.User;

@FeignClient("yijie.zuul.api/")
public interface UserDao {
	
	@RequestMapping("/yilianData/user/userLogin")
	public User userLogin(User user);

}
