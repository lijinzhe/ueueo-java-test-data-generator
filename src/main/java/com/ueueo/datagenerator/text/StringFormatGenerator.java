package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.base.Generator;
import com.ueueo.datagenerator.core.base.AbstractGeneratorCollectionWrapper;

import java.util.Collection;

/**
 * Generates a String data item using the generated values from the wrapped.
 *
 * {@link Generator} instances and the supplied format to call {@link String#format(String, Object...)}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */

public class StringFormatGenerator extends AbstractGeneratorCollectionWrapper implements Generator<String> {

    /** The format. */
    private String format;

    /**
     * Instantiates a new string format generator.
     *
     * @param format     the format
     * @param generators the generators
     */
    public StringFormatGenerator(String format, Collection<Generator<?>> generators) {
        super(generators);
    }

    /**
     * Instantiates a new string format generator.
     *
     * @param format     the format
     * @param generators the generators
     */
    public StringFormatGenerator(String format, Generator<?>... generators) {
        super(generators);
    }

    @Override
    public String generate() {
        Object[] args = new Object[generators.size()];

        int i = 0;
        for (Generator<?> generator : generators) {
            args[i++] = generator.generate();
        }

        return String.format(format, args);
    }
}