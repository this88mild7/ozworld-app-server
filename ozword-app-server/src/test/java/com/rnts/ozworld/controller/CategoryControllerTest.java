package com.rnts.ozworld.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:servlet-contextForTest.xml"})
public class CategoryControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryControllerTest.class);
	
	MockHttpServletRequest request = null;
	MockHttpServletResponse response = null;
	
	@Autowired
	CategoryController cateController;

	@Before
	public void setUp() throws Exception {
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void specDescription() {
		
		// given 

		// when
		String cateListJson = cateController.list();
		

		// then
		assertNotNull(cateListJson);
		logger.info("{}", cateListJson);

	}
}
