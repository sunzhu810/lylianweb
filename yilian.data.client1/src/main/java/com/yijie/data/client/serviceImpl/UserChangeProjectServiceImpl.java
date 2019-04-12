package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.UserChangeProjectMapper;
import com.yijie.data.client.model.UserChangeProject;
import com.yijie.data.client.service.UserChangeProjectService;
@Service
public class UserChangeProjectServiceImpl implements UserChangeProjectService {
	
	@Autowired
	private UserChangeProjectMapper userChangeProjectMapper;

	
	@Override
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject) {
		try {
			List<UserChangeProject> list = userChangeProjectMapper.projectSelect(userChangeProject);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer userCheProAdd(UserChangeProject userChangeProject) {
		try {
			userChangeProjectMapper.projectInsert(userChangeProject);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userCheProDelete(UserChangeProject userChangeProject) {
		try {
			userChangeProjectMapper.projectDelete(userChangeProject);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
