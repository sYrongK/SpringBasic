package com.mybatis.one;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	public TestListener() {};
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("서버가 시작되었습니다.");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("서버가 중지되었습니다.");
		
	}
	
	
}
