package com.ueueo.datagenerator.core;

import java.util.Arrays;
import java.util.Collection;

/**
 * An abstract class to be used as a base for classes that needs to combine
 * several generators.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public abstract class GeneratorCollectionWrapperBase {
    /**
     * Wrapped generators..
     */
    protected Collection<Generator<?>> generators;

    /**
     * Constructor.
     *
     * @param generators Wrapped generators.
     */
    public GeneratorCollectionWrapperBase(Generator<?>... generators) {
        super();
        this.generators = Arrays.asList(generators);
    }

    /**
     * Constructor.
     *
     * @param generators Wrapped generators.
     */
    public GeneratorCollectionWrapperBase(Collection<Generator<?>> generators) {
        super();
        this.generators = generators;
    }
}
