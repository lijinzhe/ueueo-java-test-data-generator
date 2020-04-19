package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.AbstractArrayGenerator;
import com.ueueo.datagenerator.core.base.Generator;

import java.util.Random;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained array and selecting them randomly.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class RandomSequenceArrayGenerator<T> extends AbstractArrayGenerator<T> implements Generator<T> {
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
    public RandomSequenceArrayGenerator(T... values) {
        super(values);
        random = new Random();
    }

    @Override
    public T generate() {
        return values[random.nextInt(values.length)];
    }
}
