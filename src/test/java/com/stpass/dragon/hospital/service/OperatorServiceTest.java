package com.stpass.dragon.hospital.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stpass.dragon.hospital.domain.OperatorBean;

public class OperatorServiceTest {

	private static OperatorService operatorService;
	private static AbstractApplicationContext context;
	
	@BeforeClass
	public static void testBeforeClass() {
		context = new ClassPathXmlApplicationContext("/META-INF/dragon-hospital.xml");
        operatorService = (OperatorService)context.getBean("OperatorService");   
	}
	
	@AfterClass
	public static void testAfterClass() {
		context.close();
	}

	@Ignore
	public void testAddOperator() {
		
        OperatorBean o = new OperatorBean();
        o.setName("中文2");
        o.setPassword("test");
        o.setTitle("test");
        o.setUsername("test");
        o.setAvailable(true);
        operatorService.addOperator(o);
		
	}
	
	@Ignore
	public void testUpdateOperator() {
		
        OperatorBean o = new OperatorBean();
        o.setName("中文2");
        o.setPassword("test");
        o.setTitle("test");
        o.setUsername("test");
        o.setAvailable(true);
        o.setId(30);
        operatorService.updateOperator(o);
		
	}
	
	@Test
	public void testUpdatePassword() {
		try{
			operatorService.updatePassword(35, "test", "test1");
		}catch(com.stpass.dragon.hospital.exception.ServiceException e) {
			System.out.println(e.getMessage());
		}
	}
}
