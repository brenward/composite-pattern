package com.bwardweb.composite;

import com.bwardweb.composite.model.Brochure;
import com.bwardweb.composite.model.StockComponent;
import com.bwardweb.composite.model.StockItem;
import com.bwardweb.composite.model.StockSection;

public class Runner {

	public static void main(String[] args) {
		StockComponent allComponents = new StockSection();
		
		Brochure brochure = new Brochure(allComponents);		
		
		StockSection appliances = new StockSection();
		appliances.add(new StockItem("Dishwasher",169.99f));
		appliances.add(new StockItem("Washing Machine",369.99f));
		appliances.add(new StockItem("Microwave",110.00f));
		appliances.add(new StockItem("Kettle",29.99f));
		appliances.add(new StockItem("Oven",500.00f));
		
		allComponents.add(appliances);
		
		StockSection computers = new StockSection();
		StockSection desktops = new StockSection();
		StockSection laptops = new StockSection();
		StockSection monitors = new StockSection();
		
		desktops.add(new StockItem("i3",400.09f));
		desktops.add(new StockItem("i5",650.29f));
		desktops.add(new StockItem("i7",1115.99f));
		desktops.add(new StockItem("ryzen",820.09f));
		
		monitors.add(new StockItem("19 inch",150.00f));
		monitors.add(new StockItem("21 inch",200.00f));
		monitors.add(new StockItem("24 inch",300.00f));
		desktops.add(monitors);
		
		laptops.add(new StockItem("surface",1399.99f));
		laptops.add(new StockItem("macbook",1999.99f));
		laptops.add(new StockItem("dell",539.99f));
		
		computers.add(desktops);
		computers.add(laptops);

		allComponents.add(computers);
		
		brochure.printStock();

	}

}
