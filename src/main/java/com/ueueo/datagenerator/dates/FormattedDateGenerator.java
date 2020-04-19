package com.ueueo.datagenerator.dates;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.GeneratorWrapperBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Generates a formatted Date string using the supplied {@link DateFormat}
 * instance. A pattern can also be supplied to use a {@link SimpleDateFormat}.
 *
 * @param <T> Type of data item to be given to {@link DateFormat#format(Date)}
 *
 * @author Agustin Barto <abarto@gmail.com>
 * @see DateFormat
 */
public class FormattedDateGenerator<T extends Date> extends GeneratorWrapperBase<T> implements Generator<String> {
    /**
     * A {@link DateFormat} instance that will format the generated data item.
     */
    private DateFormat dateFormat;

    /**
     * Constructor.
     *
     * @param generator  A generator to build the data items to be formatted.
     * @param dateFormat A {@link DateFormat} that will format the generated
     *                   data items.
     *
     * @see DateFormat
     */
    public FormattedDateGenerator(Generator<T> generator, DateFormat dateFormat) {
        super(generator);
        this.dateFormat = dateFormat;
    }

    /**
     * Constructor.
     *
     * @param generator A generator to build the data items to be formatted.
     * @param pattern   A pattern to build a {@link SimpleDateFormat} instance
     *                  that will be used to format the generated data items.
     *
     * @see SimpleDateFormat
     */
    public FormattedDateGenerator(Generator<T> generator, String pattern) {
        super(generator);
        dateFormat = new SimpleDateFormat(pattern);
    }

    @Override
    public String generate() {
        return dateFormat.format(generator.generate());
    }
}
