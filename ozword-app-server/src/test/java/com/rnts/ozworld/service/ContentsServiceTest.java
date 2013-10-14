package com.rnts.ozworld.service;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rnts.ozworld.dto.CategoryDto;
import com.rnts.ozworld.dto.ContentsDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:servlet-contextForTest.xml"})
public class ContentsServiceTest {
	
	@Autowired
	ContentsService contentsService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testList() {
		
		// given 

		// when
		List<ContentsDto> contentsList = contentsService.list();

		// then
		assertThat(contentsList.size(), is(not(0)));
	}
	
	@Test
	public void testListByCategoryID() {
		
		// given 
		String categoryId = "54";

		// when
		List<ContentsDto> contentsList = contentsService.listByCategoryId(categoryId);

		// then
		assertThat(contentsList.size(), is(not(0)));

	}

}
