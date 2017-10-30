package com.bwardweb.composite.model;

import java.util.ArrayList;
import java.util.Iterator;

public class StockSection extends StockComponent{
	ArrayList<StockComponent> stockCompoments;
	
	public StockSection(){
		stockCompoments = new ArrayList<>();
	}
	
	public void add(StockComponent stockComponent){
		stockComponent.add(stockComponent);
	}
	
	public void remove(StockComponent stockComponent){
		stockComponent.remove(stockComponent);
	}
	
	public StockComponent getChild(int index){
		return stockCompoments.get(index);
	}
	
	public void print(){
		Iterator<StockComponent> iterator = stockCompoments.iterator();
		
		while(iterator.hasNext()){
			StockComponent stockComponent = iterator.next();
			stockComponent.print();
		}
	}
}
