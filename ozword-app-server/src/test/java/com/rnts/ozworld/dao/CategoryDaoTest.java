package com.rnts.ozworld.dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rnts.ozworld.dto.CategoryDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:servlet-contextForTest.xml"})
public class CategoryDaoTest {
	
	@Autowired
	CategoryDao cateDao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConnection() {
		
		// given 

		// when
		int count = cateDao.connectionTest(); 

		// then
		assertThat(count, is(not(0)));

	}
	
	@Test
	public void testList() {
		
		// given 

		// when
		List<CategoryDto> cateList = cateDao.list();

		// then
		assertThat(cateList.size(), is(not(0)));

	}


}
