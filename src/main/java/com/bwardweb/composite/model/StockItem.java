package com.bwardweb.composite.model;

public class StockItem extends StockComponent{
	String name;
	float price;
	
	public StockItem(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public void print(){
		System.out.println("Item name: " + name + ", Price: " + price);
	}
}
