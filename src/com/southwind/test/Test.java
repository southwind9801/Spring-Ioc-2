package com.southwind.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.southwind.entity.Car;
import com.southwind.entity.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		User user = (User) applicationContext.getBean("user");
//		User user2 = (User) applicationContext.getBean("user");
//		System.out.println(user == user2);
		
//		User user = (User) applicationContext.getBean("user");
//		Car car = (Car) applicationContext.getBean("car");
		
//		DataSource ds = (DataSource) applicationContext.getBean("dataSource");
//		Connection conn = null;
//		try {
//			conn = ds.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(conn);
		
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
		
	}
}
