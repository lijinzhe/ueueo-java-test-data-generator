package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.RandomBasedGeneratorBase;

import java.util.Random;

/**
 * Generate {@link Integer} data items as returned by
 * {@link Random#nextInt()} or {@link Random#nextInt(int)} depending on whether
 * the limit is supplied.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class IntegerGenerator extends RandomBasedGeneratorBase implements Generator<Integer> {
    /**
     * Limit for the random number generator.
     */
    private Integer n;

    /**
     * Constructor.
     *
     * The generator will build the data items according as
     * {@link Random#nextInt()}.
     */
    public IntegerGenerator() {
        n = null;
    }

    /**
     * Constructor.
     *
     * The generator will build the data items according as
     * {@link Random#nextInt(n)}.
     *
     * @param n Limit to be supplied to the random number generator.
     */
    public IntegerGenerator(Integer n) {
        this.n = n;
    }

    @Override
    public Integer generate() {
        if (n != null) {
            return random.nextInt(n);
        } else {
            return random.nextInt();
        }
    }
}
