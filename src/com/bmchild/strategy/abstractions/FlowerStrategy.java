package com.bmchild.strategy.abstractions;

/** interface FlowerStrategy.
 * 
 * The interchangeable behavior to be used in the {@link FlowerContext}
*/
public abstract class FlowerStrategy
{

	private String name;
	
	
	
   public FlowerStrategy(String name) {
		this.name = name;
	}

/**
   * returns the flower's description
   */
   public abstract String description();

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
   
   

} // FlowerStrategy