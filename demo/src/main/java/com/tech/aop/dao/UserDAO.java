package com.tech.aop.dao;

import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	
	public void updateNickname(final String nickname) {
		System.out.println("Cambiando el nickname DAOImpl...");
	}
	
	public void updateNicknameSeconf(final String nickname) {
		System.out.println("Cambiando el nickname DAOImpl 2...");
	}

}
