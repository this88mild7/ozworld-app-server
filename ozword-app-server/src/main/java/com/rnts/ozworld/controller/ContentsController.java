package com.rnts.ozworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rnts.ozworld.common.JsonResponseMaker;
import com.rnts.ozworld.dto.CategoryDto;
import com.rnts.ozworld.dto.ContentsDto;
import com.rnts.ozworld.service.ContentsService;


@Controller
public class ContentsController {
	
	@Autowired
	private ContentsService contentsService;
	
	@Autowired
	private JsonResponseMaker jsonMaker;
	
	@RequestMapping(value = "/contents/list", produces = "application/json;charset=UTF-8")
	public @ResponseBody String list(@RequestParam String cateId) {
		List<ContentsDto> contentsList = null;
		if(cateId != null){
			contentsList = contentsService.listByCategoryId(cateId);
		}else{
			contentsList = contentsService.list();
		}
		String result = jsonMaker.contentsListToJson(contentsList);
		return result;
	}

}
