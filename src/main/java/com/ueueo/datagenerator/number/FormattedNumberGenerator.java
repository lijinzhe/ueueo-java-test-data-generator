package com.ueueo.datagenerator.number;

import com.ueueo.datagenerator.core.base.Generator;
import com.ueueo.datagenerator.core.base.AbstractGeneratorWrapper;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 * Generates a formatted Number string using the supplied {@link NumberFormat}
 * instance.
 *
 * @param <T> Type of data item to be given to {@link DateFormat#format(Date)}
 *
 * @author Agustin Barto <abarto@gmail.com>
 * @see DateFormat
 */
public class FormattedNumberGenerator<T extends Number> extends AbstractGeneratorWrapper<T> implements Generator<String> {

    /** The number format. */
    private NumberFormat numberFormat;

    /**
     * Instantiates a new formatted number generator.
     *
     * @param generator    the generator
     * @param numberFormat the number format
     */
    public FormattedNumberGenerator(Generator<T> generator, NumberFormat numberFormat) {
        super(generator);
        this.numberFormat = numberFormat;
    }

    @Override
    public String generate() {
        return numberFormat.format(generator.generate());
    }
}
