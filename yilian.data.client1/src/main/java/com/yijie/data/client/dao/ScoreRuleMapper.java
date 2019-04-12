package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.ScoreRule;

public interface ScoreRuleMapper {
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule);
	public  Integer scoreRuleInsert(ScoreRule ScoreRule);
	public  Integer scoreRuleUpdate(ScoreRule ScoreRule);
	public  Integer scoreRuleDelete(ScoreRule ScoreRule);

}
