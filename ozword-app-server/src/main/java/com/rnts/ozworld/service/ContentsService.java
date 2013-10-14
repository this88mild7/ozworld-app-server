package com.rnts.ozworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnts.ozworld.dao.ContentsDao;
import com.rnts.ozworld.dto.ContentsDto;


@Service
public class ContentsService {
	
	@Autowired
	ContentsDao contentsDao;

	public List<ContentsDto> list() {
		return contentsDao.list();
	}

	public List<ContentsDto> listByCategoryId(String categoryId) {
		return contentsDao.listByCategoryId(categoryId);
	}

}
