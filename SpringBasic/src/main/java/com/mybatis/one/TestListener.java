package com.mybatis.one;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	public TestListener() {};
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("������ ���۵Ǿ����ϴ�.");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("������ �����Ǿ����ϴ�.");
		
	}
	
	
}
