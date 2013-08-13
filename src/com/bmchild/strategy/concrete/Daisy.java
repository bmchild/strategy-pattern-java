package com.bmchild.strategy.concrete;

import com.bmchild.strategy.abstractions.FlowerStrategy;

public class Daisy extends FlowerStrategy {
	
	public Daisy() {
		super("Daisy");
	}

	public String description() {
		return "A small grassland plant (family Compositae) that has flowers with a yellow disk and white rays.";
	}

}
