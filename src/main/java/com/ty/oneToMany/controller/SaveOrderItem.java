package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.FoodOrderDao;
import com.ty.oneToMany.dao.ItemDao;
import com.ty.oneToMany.dto.FoodOrder;
import com.ty.oneToMany.dto.Item;

public class SaveOrderItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setName("ThateIdly");
		item1.setCost(20);
		item1.setQuantity(5);

		Item item2 = new Item();
		item2.setName("PapperDose");
		item2.setCost(70);
		item2.setQuantity(2);

		List<Item> items1 = new ArrayList<Item>();
		items1.add(item1);
		items1.add(item2);

		FoodOrder foodOrder1 = new FoodOrder();
		foodOrder1.setCustomerName("Moyn");
		foodOrder1.setAddress("SrinivasaNagar");
		foodOrder1.setPhoneNumber(1237894560);

		foodOrder1.setItems(items1);

		ItemDao itemDao1 = new ItemDao();
		itemDao1.saveItem(item2);
		itemDao1.saveItem(item1);

		FoodOrderDao foodOrderDao1 = new FoodOrderDao();
		foodOrderDao1.saveFoodOrder(foodOrder1);

	}

}
