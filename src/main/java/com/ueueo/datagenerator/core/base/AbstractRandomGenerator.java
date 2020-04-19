package com.ueueo.datagenerator.core.base;

import java.util.Random;

/**
 * A base for {@link Generator} classes that use an instance of {@link Random}
 * to generate data items.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public abstract class AbstractRandomGenerator {
    protected Random random;

    /**
     * Constructor.
     */
    public AbstractRandomGenerator() {
        super();
        random = new Random();
    }

    /**
     * Constructor.
     *
     * @param random A {@link Random} instance to be used to generate data
     *               items.
     */
    public AbstractRandomGenerator(Random random) {
        super();
        this.random = random;
    }
}
