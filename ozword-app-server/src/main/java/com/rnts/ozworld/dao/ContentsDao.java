package com.rnts.ozworld.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.rnts.ozworld.dto.ContentsDto;

@Repository
public class ContentsDao extends SqlSessionDaoSupport{

	public List<ContentsDto> list() {
		return getSqlSession().selectList("contentsQuery.list");
	}

	public List<ContentsDto> listByCategoryId(String categoryId) {
		return getSqlSession().selectList("contentsQuery.listByCategoryId", categoryId);
	}

}
