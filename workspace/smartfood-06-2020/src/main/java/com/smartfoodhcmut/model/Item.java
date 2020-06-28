package com.smartfoodhcmut.model;

public class Item {
	private FoodsModel food;
	private int quantity;
	private long price;
	
	public Item() {
		super();
	}
	public FoodsModel getFood() {
		return food;
	}
	public void setFood(FoodsModel food) {
		this.food = food;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
