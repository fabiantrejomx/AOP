package com.tech.aop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public void changeNickname(final String nickname) {
		System.out.println("Este es mi nuevo nikcname - Service - " + nickname);
		//Logic...
	}
	
}
