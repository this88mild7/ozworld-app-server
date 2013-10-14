package com.rnts.ozworld.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rnts.ozworld.common.JsonResponseMaker;
import com.rnts.ozworld.dto.CategoryDto;
import com.rnts.ozworld.service.CategoryService;

@Controller
public class CategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	private CategoryService cateService;
	
	@Autowired
	private JsonResponseMaker jsonMaker;
	
	@RequestMapping(value = "/category/list", produces = "application/json;charset=UTF-8")
	public @ResponseBody String list() {
		
		List<CategoryDto> cateList = cateService.list();
		String result = jsonMaker.categoryListToJson(cateList);
		return result;
	}
	
}
