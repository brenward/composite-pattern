package com.bwardweb.composite.model;

public class Brochure {
	StockComponent allItems;
	
	public Brochure(StockComponent stockComponent){
		allItems = stockComponent;
	}
	
	public void printStock(){
		allItems.print();
	}
	
}
