package com.yijie.yilian.client.service;

import java.util.List;

import com.yijie.yilian.client.model.Tender;
import com.yijie.yilian.client.model.TenderDesign;

/**
 * @描述 标书执行模块
 * @author Lucifer
 *
 */
public interface TenderService {
	
	//创建标书
	public Integer tenderBuild(Tender tender);
	
	//标书列表
	public List<Tender> tenderTable(Tender tender);
	
	//标书详细信息
	public Tender tenderMessage(Tender tender);
	
	//标书信息更新
	public Tender tenderUpdate(Tender tender);
	
	//删除标书
	public Integer tenderDelete(Tender tender);
	
	//标书附件添加
	public Integer tenderDesignAdd(List<TenderDesign> tenderDesigns);
	
	//标书附件修改
	public Integer tenderDesignUodate(List<TenderDesign> tenderDesigns);
	
	//标书附件删除
	public Integer tenderDesignDelete(TenderDesign tenderDesign);

}
