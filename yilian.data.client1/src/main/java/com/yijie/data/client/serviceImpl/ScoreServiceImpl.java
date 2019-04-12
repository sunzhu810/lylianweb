package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.ScoreRuleMapper;
import com.yijie.data.client.model.ScoreRule;
import com.yijie.data.client.service.ScoreRuleService;

@Service
public class ScoreServiceImpl implements ScoreRuleService {
	@Autowired
	ScoreRuleMapper ScoreRuleMapper;

	@Override
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return ScoreRuleMapper.scoreRuleSelect(ScoreRule);
	}

	@Override
	public Integer scoreRuleAdd(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleInsert(ScoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRuleUpdate(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleUpdate(ScoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRuleDelete(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleDelete(ScoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
