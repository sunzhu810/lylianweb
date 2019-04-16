package com.yijie.yilian.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.City;
import com.yijie.yilian.client.service.CityDataService;

/**
 * @描述 城市列表接口
 * @author Lucifer
 *
 */
@RestController  
@RequestMapping("/city")
public class CityListController {
	
	@Autowired
	private CityDataService cityDataService;
	
	// 城市列表展示
	@RequestMapping("/citylist")
	public List<City> listCity() throws Exception {
		return cityDataService.listCity();
	}
	

}
