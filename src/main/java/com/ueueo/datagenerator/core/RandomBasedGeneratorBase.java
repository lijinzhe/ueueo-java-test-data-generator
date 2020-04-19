package com.ueueo.datagenerator.core;

import java.util.Random;

/**
 * A base for {@link Generator} classes that use an instance of {@link Random}
 * to generate data items.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public abstract class RandomBasedGeneratorBase {
    protected Random random;

    /**
     * Constructor.
     */
    public RandomBasedGeneratorBase() {
        super();
        random = new Random();
    }

    /**
     * Constructor.
     *
     * @param random A {@link Random} instance to be used to generate data
     *               items.
     */
    public RandomBasedGeneratorBase(Random random) {
        super();
        this.random = random;
    }
}
