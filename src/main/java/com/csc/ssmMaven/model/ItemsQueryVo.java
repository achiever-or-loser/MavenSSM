package com.csc.ssmMaven.model;

/**
 * 
* @ClassName: ItemsQueryVo 
* @Description: 
* @author csc
* @date 2019年1月25日 下午2:46:13 
*
 */
public class ItemsQueryVo {
	
	//商品信息
	private Items items;
	
	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	//为了系统的可扩展性，对原始的pojo进行扩展
	private ItemsCustom itemsCustom;

}
