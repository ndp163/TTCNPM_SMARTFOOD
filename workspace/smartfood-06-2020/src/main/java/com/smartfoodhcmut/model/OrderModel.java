package com.smartfoodhcmut.model;

import java.util.List;

public class OrderModel {
	private int id;
	private UserModel customer;
	private List<Item> items;
	private int status;
	
	public OrderModel() {
		this.status = 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserModel getCustomer() {
		return customer;
	}
	public void setCustomer(UserModel customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int total() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice()*item.getQuantity();
		}
		return sum;
	}
	public void removeItemById(int itemId) {
		for (Item item : items) {
			if (item.getFood().getId() == itemId) {
				items.remove(item);
				return;
			}
		}
	}
}
