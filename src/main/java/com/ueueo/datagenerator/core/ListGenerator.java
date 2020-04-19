package com.ueueo.datagenerator.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates a {@link List} of data items of type <code>T</code>.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item contained in the generated {@link List}.
 */
public class ListGenerator<T> extends CollectionGeneratorBase<T, List<T>> {
	/**
	 * Constructor.
	 * 
	 * @param count The amount of elements to generate.
	 * @param generator The {@link Generator} used to create the elements of
	 * the {@link List}.
	 */
	public ListGenerator(int count, Generator<T> generator) {
		super(count, generator);
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.CollectionGeneratorBase#createCollection()
	 */
	@Override
	protected List<T> createCollection() {
		return new ArrayList<T>(count);
	}
}
