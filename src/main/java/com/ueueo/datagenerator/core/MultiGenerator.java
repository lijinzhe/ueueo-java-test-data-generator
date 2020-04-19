package com.ueueo.datagenerator.core;


/**
 * Generates an array of data items using multiple generators.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class MultiGenerator implements Generator<Object[]> {
	/**
	 * The {@link Generator} instances that will be used to generate each
	 * element of the data item array.
	 */
	private Generator<?>[] generators;
	
	/**
	 * Constructor.
	 * 
	 * @param generators {@link Generator} instances from which to generate each
	 * element of the data item array.
	 */
	public MultiGenerator(Generator<?>... generators) {
		this.generators = generators;
	}
	
	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public Object[] generate() {
		Object[] result = new Object[generators.length];
		
		for (int i = 0 ; i < generators.length ; i++) {
			result[i] = generators[i].generate();
		}
		
		return result;
	}
}
