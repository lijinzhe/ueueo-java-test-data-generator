package com.ueueo.datagenerator.number;

import com.ueueo.datagenerator.core.base.Generator;
import com.ueueo.datagenerator.core.base.AbstractRandomGenerator;

import java.util.Random;

/**
 * Generate {@link Double} data items as returned by
 * {@link Random#nextDouble()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class DoubleGenerator extends AbstractRandomGenerator implements
        Generator<Double> {

    @Override
    public Double generate() {
        return random.nextDouble();
    }
}
