package com.csc.ssmMaven.service;

import java.util.List;

import com.csc.ssmMaven.model.ItemsCustom;
import com.csc.ssmMaven.model.ItemsQueryVo;

/**
 * 
* @ClassName: ItemsService 
* @Description: 商品管理service
* @author csc
* @date 2019年1月25日 下午4:21:59 
*
 */
public interface ItemsService {
	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
	public String getNameByKey(Integer id);
}
