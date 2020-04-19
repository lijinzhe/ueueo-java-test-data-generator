package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.AbstractListGenerator;
import com.ueueo.datagenerator.core.base.Generator;

import java.util.List;
import java.util.Random;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained {@link List} selecting them randomly.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class RandomSequenceListGenerator<T> extends
        AbstractListGenerator<T> implements Generator<T> {
    /**
     * A {@link Random} instance to generate the index of the data item
     * contained within the array.
     */
    private Random random;

    /**
     * Constructor.
     *
     * @param values A {@link List} of values to be used to generate data
     *               items.
     */
    public RandomSequenceListGenerator(List<T> values) {
        super(values);
        random = new Random();
    }

    @Override
    public T generate() {
        return values.get(random.nextInt(values.size()));
    }
}
