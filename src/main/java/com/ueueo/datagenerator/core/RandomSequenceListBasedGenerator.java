package com.ueueo.datagenerator.core;

import java.util.List;
import java.util.Random;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained {@link List} selecting them randomly.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item to generate.
 */
public class RandomSequenceListBasedGenerator<T> extends
        ListBasedGeneratorBase<T> implements Generator<T> {
	/**
	 * A {@link Random} instance to generate the index of the data item
	 * contained within the array.
	 */
	private Random random;

	/**
	 * Constructor.
	 * 
	 * @param values A {@link List} of values to be used to generate data
	 * items.
	 */
	public RandomSequenceListBasedGenerator(List<T> values) {
		super(values);
		random = new Random();
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		return values.get(random.nextInt(values.size()));
	}
}
