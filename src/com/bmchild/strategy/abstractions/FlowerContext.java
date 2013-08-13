package com.bmchild.strategy.abstractions;

/** 
 * The context that holds the strategy, or behavior, that can be changed at runtime.
*/
public class FlowerContext
{
   	/**
   	 * the interchangeable behavior
   	 */
   	private FlowerStrategy flowerStrategy;

   	public FlowerContext(FlowerStrategy flowerStrategy) {
   		this.flowerStrategy = flowerStrategy;
   	}

   	public void printFlowerStrategyDescription() {
   	 	  System.out.println(this.flowerStrategy.getName() + ": " + this.flowerStrategy.description());
   	}
}