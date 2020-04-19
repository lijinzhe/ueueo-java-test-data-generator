package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.AbstractListGenerator;
import com.ueueo.datagenerator.core.base.Generator;

import java.util.Iterator;
import java.util.List;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained {@link List} extracting them in the proper sequence (as returned
 * by an {@link Iterator} instance. Once all the elements of the list were
 * returned as generated data items, the sequence is restarted.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ProperSequenceListGenerator<T> extends
        AbstractListGenerator<T> implements Generator<T> {
    /**
     * Iterator of the {@link List} of values.
     */
    private Iterator<T> iterator;

    /**
     * Constructor.
     *
     * @param values A {@link List} of values that will be used to generate
     *               data items.
     */
    public ProperSequenceListGenerator(List<T> values) {
        super(values);
        iterator = values.iterator();
    }

    @Override
    public T generate() {
        if (!iterator.hasNext()) {
            iterator = values.iterator();
        }

        return iterator.next();
    }
}
