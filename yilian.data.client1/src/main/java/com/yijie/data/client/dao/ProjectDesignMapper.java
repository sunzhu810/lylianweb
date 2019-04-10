package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.ProjectDesign;

public interface ProjectDesignMapper {

	// 项目附件查询
	public List<ProjectDesign> projectDesignSelect(ProjectDesign projectDesign);

	// 项目附件添加
	public void projectDesignInsert(ProjectDesign projectDesign);

	// 项目附件更新
	public void projectDesignUpdate(ProjectDesign projectDesign);

	// 项目附件删除
	public void projectDesignDelete(ProjectDesign projectDesign);

}
