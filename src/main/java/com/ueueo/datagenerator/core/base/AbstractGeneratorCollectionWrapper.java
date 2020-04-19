package com.ueueo.datagenerator.core.base;

import java.util.Arrays;
import java.util.Collection;

/**
 * An abstract class to be used as a base for classes that needs to combine
 * several generators.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public abstract class AbstractGeneratorCollectionWrapper {
    /**
     * Wrapped generators..
     */
    protected Collection<Generator<?>> generators;

    /**
     * Constructor.
     *
     * @param generators Wrapped generators.
     */
    public AbstractGeneratorCollectionWrapper(Generator<?>... generators) {
        super();
        this.generators = Arrays.asList(generators);
    }

    /**
     * Constructor.
     *
     * @param generators Wrapped generators.
     */
    public AbstractGeneratorCollectionWrapper(Collection<Generator<?>> generators) {
        super();
        this.generators = generators;
    }
}
