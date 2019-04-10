package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.TenderDesign;

public interface TenderDesignMapper {

	// 标书附件查询
	public List<TenderDesign> tenderDesignSelect(TenderDesign tenderDesign);

	// 标书附件添加
	public void tenderDesignInsert(TenderDesign tenderDesign);

	// 标书附件更新
	public void tenderDesignUpdate(TenderDesign tenderDesign);

	// 标书附件删除
	public void tenderDesignDelete(TenderDesign tenderDesign);

}
