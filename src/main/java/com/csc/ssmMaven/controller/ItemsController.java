package com.csc.ssmMaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csc.ssmMaven.model.ItemsCustom;
import com.csc.ssmMaven.service.ItemsService;

/**
 * 
* @ClassName: ItemsController 
* @Description: 商品的controller
* @author csc
* @date 2019年1月25日 下午4:36:20 
*
 */
@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception{
		List<ItemsCustom> itemsList=itemsService.findItemsList(null);
		System.out.println(itemsList.size());
		for(ItemsCustom itemsCustom:itemsList) {
			String name=itemsCustom.getName();
			System.out.println(name);
		}
		System.out.println("end");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList",itemsList);
		modelAndView.setViewName("itemsList");
		
		
		return modelAndView;
	}

}
