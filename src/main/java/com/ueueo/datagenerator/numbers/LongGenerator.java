package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.RandomBasedGeneratorBase;

import java.util.Random;

/**
 * Generate {@link Long} data items as returned by
 * {@link Random#nextLong()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class LongGenerator extends RandomBasedGeneratorBase implements Generator<Long> {
    @Override
    public Long generate() {
        return random.nextLong();
    }
}
