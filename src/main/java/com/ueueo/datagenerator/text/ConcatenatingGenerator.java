package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.GeneratorCollectionWrapperBase;

import java.util.Collection;

/**
 * Generates a String concatenating the generated values by the contained.
 *
 * {@link Generator} instances.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ConcatenatingGenerator extends GeneratorCollectionWrapperBase implements Generator<String> {

    /**
     * Instantiates a new concatenating generator.
     *
     * @param generators the generators
     */
    public ConcatenatingGenerator(Collection<Generator<?>> generators) {
        super(generators);
    }

    /**
     * Instantiates a new concatenating generator.
     *
     * @param generators the generators
     */
    public ConcatenatingGenerator(Generator<?>... generators) {
        super(generators);
    }

    @Override
    public String generate() {
        StringBuffer stringBuffer = new StringBuffer();

        for (Generator<?> generator : generators) {
            stringBuffer.append(generator.generate());
        }

        return stringBuffer.toString();
    }

}
