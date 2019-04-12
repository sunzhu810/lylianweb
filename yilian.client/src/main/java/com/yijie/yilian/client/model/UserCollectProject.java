package com.yijie.yilian.client.model;

/**
 * @描述 用户已收藏项目
 * @author Lucifer
 *
 */
public class UserCollectProject {

	// 自增ID
	private Integer id;

	// 对应项目UUID
	private String pro_uuid;

	// 收藏项目用户UUID
	private String user_uuid;

	// 项目名称
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPro_uuid() {
		return pro_uuid;
	}

	public void setPro_uuid(String pro_uuid) {
		this.pro_uuid = pro_uuid;
	}

	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "UserCollectProject [id=" + id + ", pro_uuid=" + pro_uuid + ", user_uuid=" + user_uuid + ", title="
				+ title + "]";
	}

	public UserCollectProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCollectProject(Integer id, String pro_uuid, String user_uuid, String title) {
		super();
		this.id = id;
		this.pro_uuid = pro_uuid;
		this.user_uuid = user_uuid;
		this.title = title;
	}

}
