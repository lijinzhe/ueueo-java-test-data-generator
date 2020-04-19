package com.ueueo.datagenerator.util;

/**
 * Transforms an object.
 *
 * @param <S> Input object type.
 * @param <T> Output object type.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public interface Transformer<S, T> {
    /**
     * Transforms the input.
     *
     * @param input
     *
     * @return The input transformed.
     */
    T transform(S input);
}
