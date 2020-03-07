package io.vlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.vlabs.dao.JdbcDaoImpl;
import io.vlabs.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		
//		Circle circle = new JdbcDaoImpl().getCircle(1);
//		Circle circle = dao.getCircle(1);
//		System.out.println(circle.getName());
		System.out.println(dao.getCircleName(1));

	}

}
