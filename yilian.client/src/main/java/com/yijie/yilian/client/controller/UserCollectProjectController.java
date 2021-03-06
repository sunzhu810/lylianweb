package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.UserCollectProject;
import com.yijie.yilian.client.service.UserCollectProjectService;

/**
 * @描述 用户收藏
 * @author 陈桥
 *
 */
@RestController
@RequestMapping("/user")

public class UserCollectProjectController {
	Map<String, Object> result = new HashMap<String, Object>();
	@Autowired
	UserCollectProjectService userCollectProjectService;
/**
 * 用户收藏列表
 * @param userCollectProject
 * @return
 */
	@RequestMapping("/uesrCollectProjectTable")
	public  Map<String, Object> uesrCollectProjectTable(@RequestBody UserCollectProject userCollectProject) {
		try {
		List<UserCollectProject> list = userCollectProjectService.UserCollectProjecttable(userCollectProject);
		result.put("list", list);
		result.put("code", 1);
		return result;
	} catch (Exception e) {
		e.printStackTrace();
		result.put("code", 0);
		result.put("msg", "系统出错");
		return result;
		
	}
		
	}
	/**
	 * 添加收藏
	 * @param userCollectProject
	 * @return
	 */
	@RequestMapping("/userColProAdd")
	public Map<String, Object> userColProAdd(@RequestBody UserCollectProject userCollectProject){
		try{
			System.out.println(userCollectProject);
		Integer code =userCollectProjectService.userColProAdd(userCollectProject);
		result.put("code", code);
		return result;
	} catch (Exception e) {
		e.printStackTrace();
		result.put("code", 0);
		result.put("msg", "系统出错");
		return result;
	}		
	};
	/*删除收藏
	 * 
	 */
	@RequestMapping("/userColProDelete")
	public Map<String, Object> userColProDelete(@RequestBody UserCollectProject userCollectProject){
		try{
			Integer code =userCollectProjectService.userColProDelete(userCollectProject);
		result.put("code", code);
		return result;
	} catch (Exception e) {
		e.printStackTrace();
		result.put("code", 0);
		result.put("msg", "系统出错");
		return result;
	}		
	};
	

}
