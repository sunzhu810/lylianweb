package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.UserBidding;

public interface UserBiddingMapper {

	// 用户竞标信息查询
	public List<UserBidding> userBiddingSelect(UserBidding userBidding);

	// 用户竞标
	public void userBiddingInsert(UserBidding userBidding);

	// 用户竞标更新
	public void userBiddingUpdate(UserBidding userBidding);

	// 用户竞标注销
	public void userBiddingDelete(UserBidding userBidding);

}
