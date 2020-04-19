package com.ueueo.datagenerator.core;

import java.util.HashSet;
import java.util.Set;

/**
 * Generates a {@link Set} of data items of type <code>T</code>.
 *
 * @param <T> Type of data item contained in the generated {@link Set}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class SetGenerator<T> extends CollectionGeneratorBase<T, Set<T>> {
    /**
     * Constructor.
     *
     * @param count     The amount of elements to generate.
     * @param generator The {@link Generator} used to create the elements of
     *                  the collection.
     */
    public SetGenerator(int count, Generator<T> generator) {
        super(count, generator);
    }

    @Override
    protected Set<T> createCollection() {
        return new HashSet<T>(count);
    }
}
