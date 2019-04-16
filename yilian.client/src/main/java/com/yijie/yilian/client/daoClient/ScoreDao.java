package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.ScoreRecord;


/**
 * 
 * 积分记录接口
 * 
 * @author sunzhu
 *
 */
@FeignClient("yilian.data.client")
public interface ScoreDao {
	
	//积分记录查询
	@RequestMapping("/ScoreRecord/ScoreRecordSelect")
	public List<ScoreRecord> scoreRecordSelect(ScoreRecord scoreRecord);
	
	//积分记录添加
	@RequestMapping("/ScoreRecord/ScoreRecordInsert")
	public Integer scoreRecordInsert(ScoreRecord scoreRecord);
	
	//积分记录更新
	@RequestMapping("/ScoreRecord/ScoreRecordDelete")
	public Integer scoreRecordUpdate(ScoreRecord scoreRecord);
	
	//积分记录删除
	@RequestMapping("/ScoreRecord/ScoreRecordUpdate")
	public Integer scoreRecordDelete(ScoreRecord scoreRecord);

}
