package com.csc.ssmMaven.test.mybatis;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csc.ssmMaven.model.ItemsCustom;
import com.csc.ssmMaven.service.ItemsService;
import com.csc.ssmMaven.service.imp.ItemsServiceImp;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext-*.xml"})  

public class TestMybatis {
	
	@Autowired
	private ItemsService itemsService;
	//= null;
//	
//  private ApplicationContext ac = null;  
//
//	
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext-*.xml");  
//      itemsService = (ItemsService) ac.getBean("itemsService"); 
//      
//  }
	
	@Test  
    public void test1() throws Exception {
		List<ItemsCustom> itemsList=itemsService.findItemsList(null);
		System.out.println(itemsList.size());
		for(ItemsCustom itemsCustom:itemsList) {
			String name=itemsCustom.getName();
			System.out.println(name);
		}
		System.out.println("end");
//		System.out.println("ss");
//		String name=itemsService.getNameByKey(1);
//		System.out.println(name);
//		System.out.println("ee");
	}

	

}
