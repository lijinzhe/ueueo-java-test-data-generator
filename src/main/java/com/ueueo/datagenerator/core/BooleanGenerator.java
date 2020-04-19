package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.core.base.AbstractRandomGenerator;
import com.ueueo.datagenerator.core.base.Generator;

import java.util.Random;

/**
 * Generates {@link Boolean} values using {@link Random#nextBoolean()} using
 * the wrapped {@link Random} instance.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class BooleanGenerator extends AbstractRandomGenerator implements Generator<Boolean> {
    @Override
    public Boolean generate() {
        return random.nextBoolean();
    }
}
