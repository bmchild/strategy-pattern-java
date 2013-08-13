package com.bmchild.strategy.concrete;

import com.bmchild.strategy.abstractions.FlowerStrategy;

public class HoneySuckle extends FlowerStrategy {

	public HoneySuckle() {
		super("HoneySuckle");
	}

	public String description() {
		return "A widely distributed climbing shrub (genera Lonicera and Diervilla) with tubular flowers that are typically fragrant and of two colors";
	}

}
