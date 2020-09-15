package com.tech.aop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tech.aop.dao.UserDAO;
import com.tech.aop.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDAO userDAO;
	
	
	

	@Test
	void serviceTest() {
		System.out.println("------Start Test-----");
		
		userService.changeNickname("FabMX");
		
		
		System.out.println("------Final Test-----");
	}
	
	
	
	
	
	@Test
	void daoTest() {
		userDAO.updateNickname("FabMX");
		userDAO.updateNicknameSeconf("FabMX");
	}

}
