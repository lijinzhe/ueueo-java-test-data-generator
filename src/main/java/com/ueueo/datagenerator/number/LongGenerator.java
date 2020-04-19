package com.ueueo.datagenerator.number;

import com.ueueo.datagenerator.core.base.Generator;
import com.ueueo.datagenerator.core.base.AbstractRandomGenerator;

import java.util.Random;

/**
 * Generate {@link Long} data items as returned by
 * {@link Random#nextLong()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class LongGenerator extends AbstractRandomGenerator implements Generator<Long> {
    @Override
    public Long generate() {
        return random.nextLong();
    }
}
