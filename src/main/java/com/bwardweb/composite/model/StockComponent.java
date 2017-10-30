package com.bwardweb.composite.model;

public abstract class StockComponent {
	public void add(StockComponent stockComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(StockComponent stockComponent){
		throw new UnsupportedOperationException();
	}
	
	public StockComponent getChild(int index){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
}
