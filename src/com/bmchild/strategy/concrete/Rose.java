package com.bmchild.strategy.concrete;

import com.bmchild.strategy.abstractions.FlowerStrategy;

public class Rose extends FlowerStrategy {

	public Rose() {
		super("Rose");
	}

	public String description() {
		return "A prickly bush or shrub (genus Rosa) that typically bears red, pink, yellow, or white fragrant flowers, native to north temperate";
	}

}
