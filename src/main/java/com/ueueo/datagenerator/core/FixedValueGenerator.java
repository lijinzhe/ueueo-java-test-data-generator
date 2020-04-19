package com.ueueo.datagenerator.core;

/**
 * Generates a fixed value of type <code>T</code>.<p>If <code>g</code> is a
 * {@link FixedValueGenerator}, then for all <code>x</code>, and <code>y</code>
 * of type <code>T</code> such that <code>x = g.generate()</code> and
 * <code>y = g.generate()</code>, then <code>x.equals(y)</code> holds.</p>
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item to generate.
 */
public class FixedValueGenerator<T> implements Generator<T> {
	/**
	 * The item to be given as a result to calls of {@link #generate()}.
	 */
	private T value;

	/**
	 * Constructor.
	 * 
	 * @param value The value that will be used as generated data item.
	 */
	public FixedValueGenerator(T value) {
		super();
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		return value;
	}
}
