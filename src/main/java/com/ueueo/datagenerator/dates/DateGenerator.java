package com.ueueo.datagenerator.dates;

import com.ueueo.datagenerator.core.Generator;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Generates {@link Date} instances between two given dates.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class DateGenerator implements Generator<Date> {
    /**
     * {@link Random} instance to generate values within the given period.
     */
    private Random random;

    /**
     * The start of the period (as returned by {@link Date#getTime()} that
     * contains the generated data items.
     */
    private Long startTime;

    /**
     * The end of the period (as returned by {@link Date#getTime()} that
     * contains the generated data items.
     */
    private Long endTime;

    /**
     * Constructor.
     *
     * @param start The start of the period that contains the generated data
     *              items.
     * @param end   The start of the period that contains the generated data
     *              items.
     */
    public DateGenerator(Date start, Date end) {
        super();
        this.startTime = start.getTime();
        this.endTime = end.getTime();
        random = new Random();
    }

    /**
     * Constructor.
     *
     * @param start The start of the period that contains the generated data
     *              items.
     * @param end   The start of the period that contains the generated data
     *              items.
     */
    public DateGenerator(Calendar start, Calendar end) {
        this(start.getTime(), end.getTime());
    }

    @Override
    public Date generate() {
        return new Date(startTime + ((Double) ((endTime - startTime) * random.nextDouble())).longValue());
    }
}
