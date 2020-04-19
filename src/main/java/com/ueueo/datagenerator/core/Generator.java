package com.ueueo.datagenerator.core;

/**
 * The core of the jeneratedata library. An implementation of this interface
 * would be used to generate data items of type <code>T</code>.
 *
 * @param <T> Type of data item to generate.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public interface Generator<T> {
    /**
     * Generates a data item of type T. Depending on the implementation it
     * could be random data, data extracted from a predefined set of values,
     * collections of values, etc.
     *
     * @return The generated data item.
     */
    T generate();
}