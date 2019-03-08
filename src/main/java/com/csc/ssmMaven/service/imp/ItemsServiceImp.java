package com.csc.ssmMaven.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.ssmMaven.mapper.ItemsMapperCustom;
import com.csc.ssmMaven.model.ItemsCustom;
import com.csc.ssmMaven.model.ItemsQueryVo;
import com.csc.ssmMaven.service.ItemsService;

@Service("itemsService")
public class ItemsServiceImp implements ItemsService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public String getNameByKey(Integer id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return itemsMapperCustom.getNameByKey(id);
	}

}
