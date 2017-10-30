package com.bwardweb.composite;

import com.bwardweb.composite.model.Brochure;
import com.bwardweb.composite.model.StockComponent;
import com.bwardweb.composite.model.StockSection;

public class Runner {

	public static void main(String[] args) {
		StockComponent allComponents = new StockSection();
		
		Brochure brochure = new Brochure(allComponents);
		brochure.printStock();

	}

}
