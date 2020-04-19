package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.Generator;

/**
 * Generates a fixed value of type <code>T</code>.<p>If <code>g</code> is a
 * {@link FixedValueGenerator}, then for all <code>x</code>, and <code>y</code>
 * of type <code>T</code> such that <code>x = g.generate()</code> and
 * <code>y = g.generate()</code>, then <code>x.equals(y)</code> holds.</p>
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
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

    @Override
    public T generate() {
        return value;
    }
}
