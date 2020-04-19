package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.base.Generator;
import com.ueueo.datagenerator.core.base.AbstractGeneratorWrapper;

/**
 * Uses the contained {@link Generator} to generate data items calling
 * {@link String#valueOf(Object)} to give its own results.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ToStringGenerator extends AbstractGeneratorWrapper<Object> implements
        Generator<String> {
    /**
     * Constructor.
     *
     * @param generator The wrapped {@link Generator} instance.
     */
    public ToStringGenerator(Generator<Object> generator) {
        super(generator);
    }

    @Override
    public String generate() {
        return String.valueOf(generator.generate());
    }
}
