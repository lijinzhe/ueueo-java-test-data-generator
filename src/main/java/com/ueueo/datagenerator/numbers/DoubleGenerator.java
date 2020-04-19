package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.RandomBasedGeneratorBase;

import java.util.Random;

/**
 * Generate {@link Double} data items as returned by
 * {@link Random#nextDouble()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class DoubleGenerator extends RandomBasedGeneratorBase implements
        Generator<Double> {
    /*
     * (non-Javadoc)
     *
     * @see com.weiming.datagenerator.core.Generator#generate()
     */
    @Override
    public Double generate() {
        return random.nextDouble();
    }
}
