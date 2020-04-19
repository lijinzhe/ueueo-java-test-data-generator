package com.ueueo.datagenerator.core;

import java.util.Random;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained array and selecting them randomly.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item to generate.
 */
public class RandomSequenceArrayBasedGenerator<T> extends ArrayBasedGeneratorBase<T> implements Generator<T> {
	/**
	 * A {@link Random} instance to generate the index of the data item
	 * contained within the array.
	 */
	private Random random;
	
	/**
	 * Constructor.
	 * 
	 * @param values An array of values from which to extract the data items.
	 */
	public RandomSequenceArrayBasedGenerator(T... values) {
		super(values);
		random = new Random();
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		return values[random.nextInt(values.length)];
	}
}
