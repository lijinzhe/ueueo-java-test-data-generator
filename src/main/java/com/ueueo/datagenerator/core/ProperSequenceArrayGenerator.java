package com.ueueo.datagenerator.core;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained array and extracting them in the proper sequence. If
 * <code>a</code> is the contained array of type <code>T[]</code>, then the
 * first generated date item will be <code>a[0]</code>, the second
 * <code>a[1]</code>, and so on. Once <code>a[a.length - 1]</code> is given,
 * the next call to {@link #generate()} will restart the sequence with
 * <code>a[0]</code>.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ProperSequenceArrayGenerator<T> extends ArrayBasedGeneratorBase<T> implements Generator<T> {
    /**
     * Index of the data item contained within the array.
     */
    private int index;

    /**
     * Constructor.
     *
     * @param values An array of values that will be used to generate data
     *               items.
     */
    public ProperSequenceArrayGenerator(T... values) {
        super(values);
        index = 0;
    }

    @Override
    public T generate() {
        return values[++index % values.length];
    }

}
