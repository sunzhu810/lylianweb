package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.ScoreRule;
import com.yijie.data.client.service.ScoreRuleService;

@RestController
@RequestMapping("/user")
public class ScoreRuleController  {
    @Autowired
    ScoreRuleService  ScoreRuleService;
  
    @RequestMapping("/scoreRuleSelect")
    public List<ScoreRule>  scoreRuleSelect(@RequestBody ScoreRule ScoreRule){
    
    	return ScoreRuleService.scoreRuleSelect(ScoreRule);	
    }
    @RequestMapping("/scoreRuleAdd")
    public Integer scoreRuleAdd(@RequestBody ScoreRule ScoreRule) {
		return ScoreRuleService.scoreRuleAdd(ScoreRule);  	
    }
    @RequestMapping("/scoreRuleUpdate")
    public Integer scoreRuleUpdate(@RequestBody ScoreRule ScoreRule) {
		return ScoreRuleService.scoreRuleUpdate(ScoreRule);
    }@RequestMapping("/scoreRuleDelete")
    public Integer scoreRuleDelete(@RequestBody ScoreRule ScoreRule) {
		return ScoreRuleService.scoreRuleDelete(ScoreRule);
    	
    }
    
}
