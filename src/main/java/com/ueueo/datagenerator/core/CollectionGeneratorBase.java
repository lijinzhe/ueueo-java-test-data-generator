package com.ueueo.datagenerator.core;

import java.util.Collection;

/**
 * An abstract class to be extended by classes that generate collections of
 * values of type <code>T</code>.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <S> The type of {@link Collection} to generate.
 * @param <T> The type of values to be contained by the generated
 * {@link Collection}.
 */
public abstract class CollectionGeneratorBase<S, T extends Collection<S>> extends GeneratorWrapperBase<S> implements Generator<T> {
	/**
	 * The amount of elements to generate.
	 */
	protected int count;

	/**
	 * Constructor.
	 * 
	 * @param count The amount of elements to generate.
	 * @param generator The {@link Generator} used to create the elements of
	 * the collection.
	 */
	public CollectionGeneratorBase(int count, Generator<S> generator) {
		super(generator);
		this.count = count;
	}

	/**
	 * Creates an empty collection to be filled using the wrapped
	 * {@link Generator}.
	 * 
	 * @return An empty collection of type <code>T</code>.
	 */
	protected abstract T createCollection();

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		T collection = this.createCollection();
		
		for (int i = 0; i < count; i++) {
			collection.add(generator.generate());
		}
		
		return collection;
	}
}
