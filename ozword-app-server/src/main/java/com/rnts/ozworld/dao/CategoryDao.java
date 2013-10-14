package com.rnts.ozworld.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.rnts.ozworld.dto.CategoryDto;

@Repository
public class CategoryDao extends SqlSessionDaoSupport{


	public List<CategoryDto> list() {
		return getSqlSession().selectList("categoryQuery.list");
	}

}
