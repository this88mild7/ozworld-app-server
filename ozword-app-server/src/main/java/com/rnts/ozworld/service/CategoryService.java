package com.rnts.ozworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnts.ozworld.dao.CategoryDao;
import com.rnts.ozworld.dto.CategoryDto;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDao cateDao;

	public List<CategoryDto> list() {
		return cateDao.list();
	}

}
