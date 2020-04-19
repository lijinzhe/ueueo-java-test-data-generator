package com.ueueo.datagenerator.date;

import com.ueueo.datagenerator.core.base.Generator;

/**
 * Generates {@link Long} calling {@link System#currentTimeMillis()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class SystemTimeGenerator implements Generator<Long> {
    @Override
    public Long generate() {
        return System.currentTimeMillis();
    }

}
