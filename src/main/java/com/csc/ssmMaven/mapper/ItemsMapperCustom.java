package com.csc.ssmMaven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.csc.ssmMaven.model.ItemsCustom;
import com.csc.ssmMaven.model.ItemsQueryVo;

public interface ItemsMapperCustom {
	
	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
	
	@Select("select detail from Items where id = #{id}")
	public String getNameByKey(Integer id);
}