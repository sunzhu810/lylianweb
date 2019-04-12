package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserCollectProject;

public interface UserCollectProjectService {
	
	public UserCollectProject userColProMessage(UserCollectProject userCollectProject);
	
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectProject);
	
	public Integer userColProAdd(UserCollectProject userCollectProject);
	
	public Integer userColProDelete(UserCollectProject userCollectProject);

}
