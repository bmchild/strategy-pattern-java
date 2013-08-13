package com.bmchild.strategy;

import com.bmchild.strategy.abstractions.FlowerContext;
import com.bmchild.strategy.concrete.Daisy;
import com.bmchild.strategy.concrete.HoneySuckle;
import com.bmchild.strategy.concrete.Rose;

/**
 * Main class to show the stragey pattern
 * 
 * @author bchild
 *
 */
public class RunMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FlowerContext(new Daisy()).printFlowerStrategyDescription();
		new FlowerContext(new HoneySuckle()).printFlowerStrategyDescription();
		new FlowerContext(new Rose()).printFlowerStrategyDescription();
	}

}
