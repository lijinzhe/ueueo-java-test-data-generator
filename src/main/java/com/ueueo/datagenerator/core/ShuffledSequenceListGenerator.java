package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.AbstractListGenerator;
import com.ueueo.datagenerator.core.base.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained {@link List} shuffling its contents. Once all the elements of the
 * list were returned as generated data items, the sequence is restarted.
 * There's also the option to re-shuffle the values after the sequence is
 * exhausted.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ShuffledSequenceListGenerator<T> extends AbstractListGenerator<T> implements Generator<T> {
    /**
     * Indicates that the list of values should be re-shuffled after exhausting
     * the sequence.
     */
    private Boolean reShuffle;

    /**
     * An iterator to generate a sequence of data items from the contained
     * {@link List}.
     */
    private Iterator<T> iterator;

    /**
     * Constructor.
     *
     * @param reShuffle Indicates if the values should be re-shuffled after
     *                  a sequence is exhausted.
     * @param values    A {@link List} of values to be used to generate data
     *                  items.
     */
    public ShuffledSequenceListGenerator(Boolean reShuffle, List<T> values) {
        super(new ArrayList<T>(values));
        Collections.shuffle(this.values);
        iterator = this.values.iterator();
        this.reShuffle = reShuffle;
    }

    @Override
    public T generate() {
        if (!iterator.hasNext()) {
            if (reShuffle) {
                Collections.shuffle(this.values);
            }

            iterator = values.iterator();
        }

        return iterator.next();
    }
}
