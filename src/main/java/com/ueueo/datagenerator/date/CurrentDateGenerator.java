package com.ueueo.datagenerator.date;

import com.ueueo.datagenerator.core.base.Generator;

import java.util.Date;

/**
 * Generates {@link Date} with the current date/time with each call to
 * {@link #generate()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class CurrentDateGenerator implements Generator<Date> {
    @Override
    public Date generate() {
        return new Date();
    }
}
