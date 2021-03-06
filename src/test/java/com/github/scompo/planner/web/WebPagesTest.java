package com.github.scompo.planner.web;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.scompo.planner.annotations.WebTest;

@WebTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WebPagesTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setUp() {

		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void rootShouldRespondOk() throws Exception {

		ResultActions performed = mockMvc.perform(get(Urls.ROOT));
		ResultActions expectation = performed.andExpect(status().isOk());
		MockHttpServletResponse response = expectation.andReturn().getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}

	@Test
	public void homeShouldRespondOk() throws Exception {

		ResultActions performed = mockMvc.perform(get(Urls.HOME));
		ResultActions expectation = performed.andExpect(status().isOk());
		MockHttpServletResponse response = expectation.andReturn().getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
}
